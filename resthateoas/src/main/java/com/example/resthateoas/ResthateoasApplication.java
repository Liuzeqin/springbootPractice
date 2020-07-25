package com.example.resthateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResthateoasApplication {
    //通俗点理解，就是在返回资源时附带资源链接
    public static void main(String[] args) {
        SpringApplication.run(ResthateoasApplication.class, args);
    }

}
