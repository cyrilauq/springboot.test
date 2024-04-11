/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.config;

import com.example.demo.services.TestServices;
import java.util.Random;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

/**
 * This class is in charge of declaring the dependency configuration of the application.
 * 
 * @author cyril
 */
@Configuration
public class AutowiringConfig {
    /**
     * Configure a bean that will be created on each HTTP request.
     * 
     * @return  The configured beans.
     */
    @Bean
    @RequestScope
    public TestServices getTestServices() {
        return new TestServices(new Random().nextInt(50));
    }
}
