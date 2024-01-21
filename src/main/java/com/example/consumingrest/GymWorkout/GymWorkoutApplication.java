package com.example.consumingrest.GymWorkout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GymWorkoutApplication {
    private static final Logger log = LoggerFactory.getLogger(GymWorkoutApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GymWorkoutApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder
                .defaultHeader("X-RapidAPI-Key", "58464983d0mshdc926a3e4393c7dp1c264cjsne983ea5f52d8")
                .defaultHeader("X-RapidAPI-Host", "gym-workout1.p.rapidapi.com")
                .build();
    }
}