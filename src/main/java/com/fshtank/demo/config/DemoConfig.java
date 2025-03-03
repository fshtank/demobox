/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fshtank.demo.config;

import com.fshtank.demo.LambdaExample;
import com.fshtank.demo.StreamIntermediateOperationsExample;
import com.fshtank.demo.dao.DemoDataDao;
import com.fshtank.demo.dao.impl.DemoDataDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Rick Fisher (ess-zee-en-elef-zero)
 */
@Configuration
@EnableWebMvc
@Import({DemoWebConfig.class, JdbcConfig.class, SQLqueryConfigs.class})
@ComponentScan(basePackages = "com.fshtank.demo")

@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:sql-query.properties")
})

public class DemoConfig {

    @Value("BLS Demo App")
    private String applicationName;



    /*
     * GETTERS and SETTERS
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        System.out.println("Starting Application Name: " + this.applicationName);
    }



    @Bean
    public DemoDataDao getBlsDataDao() {
        return new DemoDataDaoImpl();
    }

    @Bean
    public SQLqueryConfigs getSQLqueryConfigs() {
        return new SQLqueryConfigs();
    }

    @Bean
    public LambdaExample getLambdaExample() {
        return new LambdaExample();
    }

    @Bean
    public StreamIntermediateOperationsExample getStreamIntermediateOperationsExample() {
        return new StreamIntermediateOperationsExample();
    }
}

