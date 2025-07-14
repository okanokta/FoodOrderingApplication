package com.e_commerce.commerce.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.e_commerce.commerce.dto.CustomerSaveRequestDto;
import com.e_commerce.commerce.model.Customer;
import com.e_commerce.commerce.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	private final CustomerRepository customerRepository;
	private final ModelMapper modelMapper;
	
	public Boolean saveCustomer(CustomerSaveRequestDto customerSaveRequestDto) {
		Customer customer = modelMapper.map(customerSaveRequestDto, Customer.class);
		customerRepository.save(customer);
		return true;
	}
	
}
