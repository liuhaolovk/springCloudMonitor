package com.bonatone.httpclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:
 * Date: 2017/8/6
 * Time: 15:15
 * Author : LiuHao
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main (String[] args){
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
