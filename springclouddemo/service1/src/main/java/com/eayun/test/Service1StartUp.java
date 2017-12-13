package com.eayun.test;/**
 * Created by cxy on 2017/11/8.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service1StartUp{
    public static void main(String[] args) {
        SpringApplication.run(Service1StartUp.class, args);
    }
}
