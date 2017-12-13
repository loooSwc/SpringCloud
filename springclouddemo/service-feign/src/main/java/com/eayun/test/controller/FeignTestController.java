package com.eayun.test.controller;/**
 * Created by cxy on 2017/11/8.
 */

import com.eayun.test.service.FeignTestService;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestController{
    @Autowired
    FeignTestService feignTestService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignTestService.sayHi(name);
    }
}
