package com.acm.apiconnectg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://fakestoreapi.com/")
                .build();
    }
}
