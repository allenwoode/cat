package com.example.cat.codegen;


/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: CodeGenApplication
 * Author:   feilin
 * Date:     2021/6/7 上午12:26
 * Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CodeGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGenApplication.class, args);
    }
}
