package com.devsuperior.desafio_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class DesafioCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioCrudApplication.class, args);
		Locale.setDefault(Locale.US);
	}

}
