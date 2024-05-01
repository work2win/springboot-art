package com.workwin.art.controller;

import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.workwin.art.model.Room;
import com.workwin.art.repository.RoomRepository;
import com.workwin.art.service.RoomService;
import java.net.URI;
@CrossOrigin
@RestController
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	RoomRepository roomRepository;
	
	RoomController(RoomRepository roomRepository){
		this.roomRepository = roomRepository;
	}
	
	@PostMapping("/room")
	ResponseEntity<Room> createRoom(@Valid @RequestBody Room room) throws URISyntaxException{
		
		Room newroom = roomRepository.save(room);
		return ResponseEntity.created(new URI("/room/" + newroom.getId())).body(newroom);
	}
	
	
	
	
	@GetMapping("/rooms")
	public List<Room> rooms(){
		
		List<Room> rooms = roomService.totalRooms();
		int count = roomService.totalRooms().size();
		System.out.println("**"+count);
		for(int i = 0; i < count ; i++)
			System.out.println("ID:"+roomService.totalRooms().get(i).getId());
		
		
		return roomService.totalRooms();
	}
	
	@GetMapping("/room/{id}")
	public Room room(@PathVariable int  id) {
		System.out.println("**"+id);
		return roomService.checkbyId(id);
	}
	
	@PutMapping("/room/{id}")
	ResponseEntity<Room> updateRoom(@Valid @RequestBody Room room){
		
		Room newroom = roomRepository.save(room);
		return ResponseEntity.ok().body(newroom);
	}
	
	@DeleteMapping("room/{id}")
	public ResponseEntity<?> deleteRoom(@PathVariable int id){
		roomRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/totalrooms")
	@ResponseBody
	public int totalrooms() {
		List<Room> rooms = roomService.totalRooms();
		int count = roomService.totalRooms().size();
		System.out.println("******"+rooms.size());
		System.out.println("******"+count);
		return  count;		
	}
	
	@GetMapping("/acrooms")
	public int acrooms() {	
		
		int ac = 0;
		int count = roomService.totalRooms().size();			
		
		for(int i = 0; i < count ; i++) {			
		String roomtype = roomService.totalRooms().get(i).getRoomType();
			if(roomtype.equalsIgnoreCase("AC")) {
				ac++;
			}
		}		
		return  ac;		
	}
	
	@GetMapping("/nonacrooms")
	public int nonacrooms() {	
		
		int nonac = 0;
		int count = roomService.totalRooms().size();		
		
		for(int i = 0; i < count ; i++) {			
		String roomtype = roomService.totalRooms().get(i).getRoomType();
			if(roomtype.equalsIgnoreCase("NONAC")) {
				nonac++;
			}
		}		
		return  nonac;		
	}
	
	
	
	
	
	

}
