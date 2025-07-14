package com.e_commerce.commerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_commerce.commerce.dto.CommentSaveRequestDto;
import com.e_commerce.commerce.service.CommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
	private final CommentService commentService;
	
	@PostMapping("/saveComment")
	public ResponseEntity<Boolean> saveComment(@RequestBody CommentSaveRequestDto commentSaveRequestDto){
		
		Boolean isSaveComment = commentService.saveComment(commentSaveRequestDto);
		return new ResponseEntity<>(isSaveComment, HttpStatus.OK);
		
	}
}
