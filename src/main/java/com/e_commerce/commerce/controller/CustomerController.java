package com.e_commerce.commerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_commerce.commerce.dto.CustomerSaveRequestDto;
import com.e_commerce.commerce.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
	
	private final CustomerService customerService;
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<Boolean> saveCustomer(@RequestBody CustomerSaveRequestDto customerSaveRequestDto){
		Boolean isSaveCustomer = customerService.saveCustomer(customerSaveRequestDto);
		return new ResponseEntity<>(isSaveCustomer, HttpStatus.OK);
	}

}
