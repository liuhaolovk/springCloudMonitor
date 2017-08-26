package com.bonatone.httpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Description:
 * Date: 2017/8/6
 * Time: 15:37
 * Author : LiuHao
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController("/")
public class MyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWebApplication.class,args);


    }
    @RequestMapping("hello")
    public String hello(){
        LocalDate localDate = LocalDate.now();
        return localDate.toString();

    }
}