/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: GatewayApplication
 * Author:   feilin
 * Date:     2021/6/7 下午10:22
 * Description:
 */
package com.example.cat.gateway;

import com.example.cat.common.feign.annotation.EnableCatFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCatFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
