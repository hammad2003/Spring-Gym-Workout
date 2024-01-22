package com.example.consumingrest.GymWorkout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(FoodInfoController.FOOD_INFO)
public class FoodInfoController {
    public static final String FOOD_INFO = "/foodinfo";

    @Autowired
    FoodInfoService foodInfoService;

    @GetMapping
    public String getFoodInfo(Model model) {
        FoodInfo[] foodInfoArray = foodInfoService.getFoodInfo();
        model.addAttribute("foodinfo", foodInfoArray);
        return "foodinfo";
    }
}