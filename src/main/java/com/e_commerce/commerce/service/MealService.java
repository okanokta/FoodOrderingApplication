package com.e_commerce.commerce.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.e_commerce.commerce.dto.MealSaveRequestDto;
import com.e_commerce.commerce.dto.MealUpdateDescriptionRequestDto;
import com.e_commerce.commerce.model.Meal;
import com.e_commerce.commerce.repository.MealRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MealService {
	
	private final MealRepository mealRepository; 
	private final ModelMapper modelMapper;
	
	public boolean saveMeal(MealSaveRequestDto mealSaveRequestDto) {
		Meal meal =  convertToMealFromMealSaveRequestDto(mealSaveRequestDto);
		mealRepository.save(meal);
		return true;
	}
	// kötü kod
	public static Meal convertToMealFromMealSaveRequestDto1(MealSaveRequestDto mealSaveRequestDto) {
		Meal meal = new Meal();
		meal.setName(mealSaveRequestDto.getName());
		meal.setDescription(mealSaveRequestDto.getDescription());
		meal.setPrice(mealSaveRequestDto.getPrice());
		
		// Yukarıdaki Set İşlemlerini yapar => BeanUtils.copyProperties(mealSaveRequestDto, meal);
		return  meal;
	}
	// iyi kod
	public Meal convertToMealFromMealSaveRequestDto(MealSaveRequestDto mealSaveRequestDto) {
		return modelMapper.map(mealSaveRequestDto, Meal.class);
		
	}

	public String updateMealDescription(MealUpdateDescriptionRequestDto mealUpdateDescriptionRequestDto) {
		Long id = mealUpdateDescriptionRequestDto.getId();
		String description = mealUpdateDescriptionRequestDto.getDescription();
		
		Optional<Meal> mealById = mealRepository.findById(id);
		
		try {
				Meal meal = mealById.get();
				meal.setDescription(description);
				mealRepository.save(meal);
				return "Güncelleme Başarılı";
			
		}catch(Exception e) {
			e.printStackTrace();
			return String.format("%s Id'ye sahip bir Yemek Bulunamadı", id);
		}
		
	}

}
