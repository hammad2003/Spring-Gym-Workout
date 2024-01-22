package com.example.consumingrest.GymWorkout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FoodInfoService {

    @Autowired
    RestTemplate restTemplate;

    protected FoodInfo[] getFoodInfo() {
        FoodInfo[] data = restTemplate.getForObject(
                "https://gym-workout1.p.rapidapi.com/food", FoodInfo[].class);
        return data;
    }
}