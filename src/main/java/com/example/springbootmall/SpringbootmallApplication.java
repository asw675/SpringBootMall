package com.example.springbootmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@MapperScan("com.example.springbootmall.dao")
@EnableElasticsearchRepositories(basePackages ="com.example.springbootmall.repository")
public class SpringbootmallApplication {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(SpringbootmallApplication.class, args);
    }

}
