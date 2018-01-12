package com.demo.springboot; /**
 * Created by Administrator on 2017/7/7.
 */

//Spring boot 框架jar包

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
