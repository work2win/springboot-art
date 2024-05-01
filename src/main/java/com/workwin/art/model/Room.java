package com.workwin.art.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="roominfo")
public class Room {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int RoomNum;
	private String RoomType;
	private int RoomPrice;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNum() {
		return RoomNum;
	}
	public void setRoomNum(int roomNum) {
		RoomNum = roomNum;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public int getRoomPrice() {
		return RoomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		RoomPrice = roomPrice;
	}
	
	

}
