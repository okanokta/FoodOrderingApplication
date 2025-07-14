package com.e_commerce.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_commerce.commerce.model.Meal;
@Repository
public interface MealRepository extends JpaRepository<Meal, Long>{

}
