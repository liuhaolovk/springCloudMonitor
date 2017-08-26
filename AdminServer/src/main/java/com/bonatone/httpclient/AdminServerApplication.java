package com.bonatone.httpclient;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Date: 2017/8/6
 * Time: 15:22
 * Author : LiuHao
 */
@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
