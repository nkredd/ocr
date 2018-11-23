package com.nkredd.ocr;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nkredd.ocr.domain.Campus;
import com.nkredd.ocr.repositories.CampusRepository;

@SpringBootApplication
public class OcrApplication implements CommandLineRunner{
	@Autowired
	private CampusRepository campusRepository;

	public static void main(String[] args) {
		SpringApplication.run(OcrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Campus campus1 = new Campus(null, "Euclides da Cunha");
		Campus campus2 = new Campus(null, "Feira de Santana");
		
		campusRepository.saveAll(Arrays.asList(campus1, campus2));
		
	}
}
