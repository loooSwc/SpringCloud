package com.eayun.test.service;/**
 * Created by cxy on 2017/11/9.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FeignTestErrorHystric implements FeignTestService{


    @Override
    public String sayHi(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}
