package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// use ComponentScan only when Config class is empty
@Configuration
@ComponentScan(basePackages = "com.example.config")
public class Config {
    // @Bean
    // public Samsung getSamsung() {
    //     return new Samsung();
    // }

    // @Bean Processor getProcessor() {
    //     return new SnapDragon();
    // }
}
