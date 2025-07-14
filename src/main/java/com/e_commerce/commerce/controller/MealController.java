package com.e_commerce.commerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_commerce.commerce.dto.MealSaveRequestDto;
import com.e_commerce.commerce.dto.MealUpdateDescriptionRequestDto;
import com.e_commerce.commerce.service.MealService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/commerce")
@RequiredArgsConstructor
public class MealController {
	private final MealService mealService;
	
	@PostMapping("/saveMeal")
	public ResponseEntity<Boolean> saveMeal(@RequestBody MealSaveRequestDto mealSaveRequestDto){
		boolean isSaveMeal = mealService.saveMeal(mealSaveRequestDto);
		return new ResponseEntity<>(isSaveMeal, HttpStatus.OK);
	}
	
	@PutMapping("/updateMealDescription")
	public ResponseEntity<String> updateMealDescription(@RequestBody MealUpdateDescriptionRequestDto mealUpdateDescriptionRequestDto){
		String isUpdateDescriptionMeal = mealService.updateMealDescription(mealUpdateDescriptionRequestDto);
		return new ResponseEntity<>(isUpdateDescriptionMeal, HttpStatus.OK);
	}

}
