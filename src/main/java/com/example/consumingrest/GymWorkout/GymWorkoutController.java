package com.example.consumingrest.GymWorkout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(GymWorkoutController.GYM_WORKOUT)
public class GymWorkoutController {
    public static final String GYM_WORKOUT = "/gymworkout";

    @Autowired
    private GymWorkoutService gymWorkoutService;

    @GetMapping
    public String getExercises(Model model) {
        Exercise[] exercises = gymWorkoutService.getExerciseList();
        model.addAttribute("exercises", exercises);
        return "gymworkout";
    }
}