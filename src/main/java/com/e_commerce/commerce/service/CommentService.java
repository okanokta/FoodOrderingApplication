package com.e_commerce.commerce.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.e_commerce.commerce.dto.CommentSaveRequestDto;
import com.e_commerce.commerce.model.Comment;
import com.e_commerce.commerce.model.Customer;
import com.e_commerce.commerce.model.Meal;
import com.e_commerce.commerce.repository.CommentRepository;
import com.e_commerce.commerce.repository.CustomerRepository;
import com.e_commerce.commerce.repository.MealRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
	
	private final CommentRepository commentRepository;
	private final MealRepository mealRepository;
	private final CustomerRepository customerRepository;
	private final ModelMapper modelMapper;

	public Boolean saveComment(CommentSaveRequestDto commentSaveRequestDto) {
//		Long customerId = commentSaveRequestDto.getCustomerId();
//		Long mealId = commentSaveRequestDto.getMealId();
//		String text = commentSaveRequestDto.getText();
//		Customer customer = customerRepository.findById(customerId).get();
//		Meal meal = mealRepository.findById(mealId).get();
//		
//		Comment comment = new Comment();
//		comment.setText(text);
//		comment.setCustomer(customer);
//		comment.setMeal(meal);
		
		modelMapper.getConfiguration()
		.setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.LOOSE);
		Comment comment = modelMapper.map(commentSaveRequestDto, Comment.class);
		commentRepository.save(comment);
		return true;
	}
	
	
	
	
}
