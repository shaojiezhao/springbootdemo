package com.example.logging.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass
{
    @Bean
    public BeanTest beanTest()
    {
        BeanTest beanTest = new BeanTest();
        return beanTest;
    }
}
