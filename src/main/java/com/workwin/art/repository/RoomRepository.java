package com.workwin.art.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workwin.art.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{
	
	Room findById(Room orElse);
	//Room findbyRoomtype(String roomtype);
	
	

}
