package com.lyrics.qq.shardingerror.swagger;

import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("swagger")
@Getter
@Setter
public class SwaggerProperties {
    //api  info
    /**
     * 标题
     */
    private String title = "swagger";
    /**
     * 描述
     */
    private String description;
    /**
     * 访问地址跟地址
     */
    private String host;
    /**
     * 服务器地址
     */
    private String termsOfServiceUrl;
    /**
     * 验证
     */
    private String license;
    /**
     * 验证服务器地址
     */
    private String licenseUrl;
    /**
     * 版本
     */
    private String version;
    // 作者 信息
    /**
     * 作者名字
     */
    private String name;
    /**
     * 网站
     */
    private String url;
    /**
     * 邮箱地址
     */
    private String email;

    // 规则 ,可以分割多个路径
    private String basePackage;
    //true 开启文档  false 关闭文档
    private Boolean enable = false;
    //头参数
    private Map<String, SwaggerParameter> headers = Maps.newHashMap();

    @Getter
    @Setter
    public static class SwaggerParameter {
        /**
         * 参数名字
         */
        private String name;
        /**
         * 参数描述
         */
        private String description;
        /**
         * 参数默认值
         */
        private String defaultValue;
        /**
         * 是否必须
         */
        private boolean required = false;
        /**
         * 是否允许有多个值
         */
        private boolean allowMultiple = false;
        /**
         * 参数类型  默认 header 参数头
         */
        private String paramType = "header";

        private String paramAccess;
        /**
         * 模型类型  默认string 类型
         */
        private String ModelReference = "string";
        /**
         * 是否隐藏
         */
        private boolean hidden = false;
    }
}
