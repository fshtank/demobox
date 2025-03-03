/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fshtank.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Configuration for Spring MVC Primarily giving us CORS config.
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.fshtank.demo")
public class DemoWebConfig implements WebMvcConfigurer {

    @Value("${cors.allowedOrigins:http://*bls.com}")
    // Bluprint: @Value("*")
    private String[] allowedOrigins;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(allowedOrigins)
                .allowedMethods("PUT", "POST", "GET", "OPTIONS", "DELETE")
                .allowedHeaders("x-requested-with")
                .allowCredentials(true)
                .maxAge(3600);
    }


}
