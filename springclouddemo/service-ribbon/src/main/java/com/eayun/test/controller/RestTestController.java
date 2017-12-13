package com.eayun.test.controller;/**
 * Created by cxy on 2017/11/8.
 */

import com.eayun.test.service.RestTestService;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController{
    @Autowired
    RestTestService restTestService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return restTestService.hiService(name);
    }
}
