package com.workwin.art.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.workwin.art.model.ArtType;
import com.workwin.art.repository.ArtTypeRepository;



@Service
public class ArtTypeService {
	
	@Autowired
	private ArtTypeRepository artTypeRepository;
	
	@GetMapping("/artTypes")
	public List <ArtType> getArtTypes() {
		
		
		return artTypeRepository.findAll();
	}
	
	
	
	@GetMapping("/artTypes/{id}")
	public ArtType getArtbyId(@PathVariable Integer id) {
		System.out.println("inside"+artTypeRepository.findAll());
		List <ArtType> artTypes = artTypeRepository.findAll();
		ArtType artType = new ArtType();
		for(int i=0; i<5; i++) {
			artType = artTypes.get(i);
			if(i == id)
				return artType;
			System.out.println(artType.getArtName());
			
		}
		return artType;
			
	}	
	
	@GetMapping("/nature")
	public String getNatureService() {
		
		String art_name = "none";
		List <ArtType> artTypes = artTypeRepository.findAll();
		ArtType artType = new ArtType();
		
		for(int i=0; i<5; i++) {
			artType = artTypes.get(i);
			String art_type = artType.getArtType();
			if(art_type.equalsIgnoreCase("NATURE_PAINTING")) {
				String value = "This is a "+artType.getArtName()+" that costs "+artType.getPrice()+" Rs ! ";
				return value;
			}
		}
		
		return art_name;
	}

}

