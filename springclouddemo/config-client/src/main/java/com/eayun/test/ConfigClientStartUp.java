package com.eayun.test;/**
 * Created by cxy on 2017/11/9.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientStartUp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientStartUp.class, args);
    }
}
