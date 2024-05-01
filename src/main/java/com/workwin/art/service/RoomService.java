package com.workwin.art.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workwin.art.model.Room;
import com.workwin.art.repository.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> totalRooms(){
		return roomRepository.findAll();
	}
	
	public Room checkbyId(int id) {
		return roomRepository.findById(id).orElse(null);		
	}
	
	/*
	 * public Room checkByName(String roomtype) { return
	 * roomRepository.findbyRoomtype(roomtype); }
	 */

}
