package com.e_commerce.commerce.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfig {
	
	// Spring Bean => proje aya kalkarken oluşan ve her yerden erişebildiğimiz yapılardır.
	// @Component anatasyonu verdiğimiz class'lar Spring Bean'i olmuş oluyor
	//@Service anatasyonuda içerisinde component anatasyonu barındırdığından bir Spring Bean'i dir.
	
	// Bir metodu Spring Bean olarak işaretlemek için "@Bean" anatasyonu kullanılır
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
