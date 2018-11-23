package com.nkredd.ocr.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkredd.ocr.domain.Campus;
import com.nkredd.ocr.repositories.CampusRepository;

@Service
public class CampusService {
	@Autowired
	private CampusRepository repo;
	
	public Campus find(Integer id) {
		Optional<Campus> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
