package com.example.consumingrest.GymWorkout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Exercise(
        int id, String name, String bodyPart, String equipment,
        String gifUrl, String[] secondaryMuscles, String[] instructions
) {}