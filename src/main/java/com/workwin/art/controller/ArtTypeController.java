package com.workwin.art.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.workwin.art.model.ArtType;
import com.workwin.art.service.ArtTypeService;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;


@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class ArtTypeController {
	
	@Autowired
	private ArtTypeService artTypeService;
	
	@GetMapping("artTypes")
	public List<ArtType> getAllArtTypes(){
		return artTypeService.getArtTypes();
	}
	
	@GetMapping("/artTypes/{id}")
	public ArtType getArtbyId(@PathVariable Integer id){
		return artTypeService.getArtbyId(id);
	}
	
		
	@GetMapping("nature")
	public String getArtNature() {
		return artTypeService.getNatureService();
	}

}
