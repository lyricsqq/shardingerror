package com.lyrics.qq.shardingerror.swagger;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@EnableSwagger2
@Configuration
@ConditionalOnClass(SwaggerProperties.class)
@EnableConfigurationProperties({SwaggerProperties.class})
@ConditionalOnProperty(prefix = "swagger", name = "enable", havingValue = "true")
public class Swagger2AutoConfiguration {
    private SwaggerProperties swaggerProperties;

    public Swagger2AutoConfiguration(SwaggerProperties swaggerProperties) {
        this.swaggerProperties = swaggerProperties;
    }

    @Bean
    public Docket createRestApi() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        ApiInfo apiInfo = apiInfoBuilder.title(swaggerProperties.getTitle())
                .description(swaggerProperties.getDescription())
                .termsOfServiceUrl(swaggerProperties.getTermsOfServiceUrl())
                .contact(new Contact(swaggerProperties.getName(), swaggerProperties.getUrl(), swaggerProperties.getEmail()))
                .version(swaggerProperties.getVersion())
                .build();
        //应用公共头关系
        List<Parameter> parameters = applyParameters(swaggerProperties.getHeaders());
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        if (swaggerProperties.getHost() != null) {
            docket.host(swaggerProperties.getHost());
        }
        docket.directModelSubstitute(Timestamp.class, String.class)
                .genericModelSubstitutes(DeferredResult.class).forCodeGeneration(false)
                .useDefaultResponseMessages(true).enable(swaggerProperties.getEnable())
                .apiInfo(apiInfo).globalOperationParameters(parameters)
                .select()
                //包路径下扫描注解
                .apis(basePackage(swaggerProperties.getBasePackage()))
                //扫描打了  api 注解的类
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //扫描打了 apioperation 注解的方法
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    /**
     * 应用 公共头参数
     *
     * @param swaggerParameterMap
     * @return
     */
    public List<Parameter> applyParameters(Map<String, SwaggerProperties.SwaggerParameter> swaggerParameterMap) {
        List<Parameter> parameters = Lists.newArrayList();
        for (SwaggerProperties.SwaggerParameter swaggerParameter : swaggerParameterMap.values()) {
            ParameterBuilder tokenPar = new ParameterBuilder();
            Parameter parameter = tokenPar.name(swaggerParameter.getName()).description(swaggerParameter.getDescription()).
                    modelRef(new ModelRef(swaggerParameter.getModelReference())).parameterType(swaggerParameter.getParamType()).
                    required(swaggerParameter.isRequired()).hidden(swaggerParameter.isHidden())
                    .defaultValue(swaggerParameter.getDefaultValue()).allowMultiple(swaggerParameter.isAllowMultiple()).build();
            parameters.add(parameter);
        }
        return parameters;
    }

    /**
     * 多包扫描匹配
     *
     * @param basePackage
     * @return
     */
    public static Predicate<RequestHandler> basePackage(final String basePackage) {
        return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
    }

    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
        return input -> {
            // 循环判断匹配
            for (String strPackage : basePackage.split(",")) {
                boolean isMatch = input.getPackage().getName().startsWith(strPackage);
                if (isMatch) {
                    return true;
                }
            }
            return false;
        };
    }

    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
        return Optional.fromNullable(input.declaringClass());
    }
}
