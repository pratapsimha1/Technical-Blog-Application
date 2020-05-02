package com.TechnicalBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.Controller"})
public class TechnicalBlogApplication {
    public static void main(String[] args){
        SpringApplication.run(TechnicalBlogApplication.class,args);
    }
}
