package com.eayun.test.controller;/**
 * Created by cxy on 2017/11/9.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController{
    @Value("${foo}")
    String foo;
    @Value("${democonfigclient.message}")
    String message;
    @RequestMapping(value = "/hi")
    public String hi(){
        System.out.println(message);
        return foo;
    }
}
