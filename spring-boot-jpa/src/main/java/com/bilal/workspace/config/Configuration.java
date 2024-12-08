package com.bilal.workspace.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            System.out.println("applicationRunner");
        };
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("commandLineRunner");

        };
    }
}
