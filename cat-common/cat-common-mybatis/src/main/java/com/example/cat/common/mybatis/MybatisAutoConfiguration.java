/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: MybatisAutoConfiguration
 * Author:   feilin
 * Date:     2021/6/6 下午11:44
 * Description:
 */
package com.example.cat.common.mybatis;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.example.cat.common.mybatis.resolver.SqlFilterArgumentResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration(proxyBeanMethods = false)
public class MybatisAutoConfiguration implements WebMvcConfigurer {

    /**
     * SQL 过滤器避免SQL注入
     *
     * @param resolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new SqlFilterArgumentResolver());
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
