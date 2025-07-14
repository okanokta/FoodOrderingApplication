package com.e_commerce.commerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentSaveRequestDto {
	private String text;
	private Long customerId;
	private Long mealId;
}
