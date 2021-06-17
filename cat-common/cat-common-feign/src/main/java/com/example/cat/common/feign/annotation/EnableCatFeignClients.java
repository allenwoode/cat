/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: EnableCatClients
 * Author:   feilin
 * Date:     2021/6/7 下午10:51
 * Description:
 */
package com.example.cat.common.feign.annotation;

import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableFeignClients
public @interface EnableCatFeignClients {

    String[] value() default {};

    String[] basePackages() default {"com.example.cat"};

    Class<?>[] basePackageClasses() default {};

    Class<?>[] defaultConfiguration() default {};

    Class<?>[] clients() default {};
}
