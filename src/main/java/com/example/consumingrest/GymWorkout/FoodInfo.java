package com.example.consumingrest.GymWorkout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
record FoodInfo(
        int id, String name, int calories,
        double protein, double fat, double carbohydrates, int weight
) {
//    @JsonProperty("Calories")
//    public int getCalories() {
//        return calories;
//    }
//
//    @JsonProperty("Protein")
//    public double getProtein() {
//        return protein;
//    }
//
//    @JsonProperty("Fat")
//    public double getFat() {
//        return fat;
//    }
//
//    @JsonProperty("Carbohydrates")
//    public double getCarbohydrates() {
//        return carbohydrates;
//    }
//
//    @JsonProperty("Weight")
//    public int getWeight() {
//        return weight;
//    }
}