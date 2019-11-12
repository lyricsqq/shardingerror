package com.lyrics.qq;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages = {"com.lyrics.qq.shardingerror.mapper"},
        markerInterface = BaseMapper.class)
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class ShardingerrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingerrorApplication.class, args);
    }

}
