package com.nkredd.ocr.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nkredd.ocr.domain.Campus;

@RestController
@RequestMapping(value="/campus")
public class CampusResource {
	@RequestMapping(method=RequestMethod.GET)
	public List<Campus> listar() {
		Campus campus1 = new Campus(1, "Euclides da Cunha");
		Campus campus2 = new Campus(2, "Feira de Santana");
		
		List<Campus> list = new ArrayList<Campus>();
		list.add(campus1);
		list.add(campus2);		
		return list;
	}

}
