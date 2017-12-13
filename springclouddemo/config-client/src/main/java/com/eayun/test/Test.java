package com.eayun.test;/**
 * Created by cxy on 2017/11/9.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Test{

    public static void main(String[] args) throws  Exception{
       HttpClient client= HttpClients.createDefault();
        HttpPost get = new HttpPost("http://localhost:8400/bus/refresh");
        HttpResponse res = client.execute(get);

        int code = res.getStatusLine().getStatusCode();

        String resData = EntityUtils.toString(res.getEntity());

        System.out.println("code:" + code);
        System.out.println("resData:" + resData);
        System.out.println("end");
    }
}
