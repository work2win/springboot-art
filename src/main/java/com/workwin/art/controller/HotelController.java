package com.workwin.art.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.workwin.art.model.Hotel;
import com.workwin.art.repository.HotelRepository;
import com.workwin.art.service.HotelService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	HotelRepository hotelRepository;
	
	HotelController(HotelRepository hotelRepository){
		this.hotelRepository = hotelRepository;
	}
	
	@GetMapping("hotel")
	public List<Hotel> getHotels(){	
		List<Hotel> hotel = hotelService.getHotel();
		List<String> name = new ArrayList<>();
		int i = 0;
		
		while(i<hotel.size()) {
			System.out.println(hotel.get(i).getBuissdesc());
			
			
			name.add(hotel.get(i).getName());
			i++;
		}
		System.out.println(name);
		
		//Collections.sort(name);
		List<String> sorted = name.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted names "+sorted);
		Stream num = Stream.of(sorted);
		num.forEach(System.out::println);
		
		return hotelService.getHotel();
	}
	
	@GetMapping("hotelbyid/{hid}")
	public Hotel getHotelRoom(@PathVariable int  hid){
		return hotelService.getHotelbyHid(hid);
	}
	
	//not working as request in postman
	@PostMapping("/hotel")
    ResponseEntity<Hotel> createHotelRoom(@Valid @RequestBody Hotel hotel) throws URISyntaxException {
		System.out.println("inside create"+hotel);
		Hotel hotelvalue = hotelRepository.save(hotel);
		System.out.println("did save create");
		return ResponseEntity.created(new URI("/hotel"+hotelvalue.getHid())).body(hotelvalue);
	}
	
	@DeleteMapping("hotelbyid/{hid}")
	public ResponseEntity<?> deleteHotelRoom(@PathVariable int hid){
		hotelRepository.deleteById(hid);
		return ResponseEntity.ok().build();
	}

}
