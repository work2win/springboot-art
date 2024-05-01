package com.workwin.art.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.workwin.art.model.Hotel;
import com.workwin.art.repository.HotelRepository;

@CrossOrigin("*")
@Controller
@RequestMapping(value="/")
public class HotelRoomController {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@GetMapping
	public ModelAndView getHotelRoomDetails() {
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
	@GetMapping("hotelroom")
	public List<Hotel> getHotels(){
		return this.hotelRepository.findAll();
	}

}
