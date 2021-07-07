package com.example.autogalleryspring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AppConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new CustomizedMapper();
    }

}