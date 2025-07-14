package com.e_commerce.commerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MealSaveRequestDto {
	private String name;
	private String description;
	private double price;

}
