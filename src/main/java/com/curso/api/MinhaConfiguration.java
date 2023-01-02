package com.curso.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

	@Bean(name = "telaDados")
	public String telaDados() {
		return "José, 18 anos, CPF: 123.123.123-12";
	}
	
}
