package com.example.consumingrest.GymWorkout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GymWorkoutService {

    @Autowired
    private RestTemplate restTemplate;

    public Exercise[] getExerciseList() {
        return restTemplate.getForObject(
                "https://gym-workout1.p.rapidapi.com/exercise", Exercise[].class);
    }
}