package com.workwin.art.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.workwin.art.model.Hotel;
import com.workwin.art.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class HotelService {
	
	@Autowired
	HotelRepository hotelRepository;
	
	@GetMapping("/hotel")
	public List<Hotel> getHotel(){
		return hotelRepository.findAll();
	}
	
	public Hotel getHotelbyHid(int hid) {
		System.out.println("inside service class");
		return hotelRepository.findById(hid).orElse(null);
	}

}
