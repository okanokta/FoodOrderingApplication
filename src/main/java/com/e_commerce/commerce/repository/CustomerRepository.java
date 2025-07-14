package com.e_commerce.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_commerce.commerce.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
