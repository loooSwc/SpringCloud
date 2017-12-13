package com.eayun.test; /**
 * Created by cxy on 2017/11/9.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulStartUp{
    public static void main(String[] args) {
        SpringApplication.run(ZuulStartUp.class, args);
    }
}
