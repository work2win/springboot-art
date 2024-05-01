package com.workwin.art.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "art")
public class ArtType implements Serializable {	 
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	private String artType;
	private String artName;
	private int price;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtType() {
		return artType;
	}

	public void setArtType(String artType) {
		this.artType = artType;
	}

	public String getArtName() {
		return artName;
	}

	public void setArtName(String artName) {
		this.artName = artName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ArtType() {}
	
	public ArtType(int id, String artType, String artName, int price) {
		super();
		this.id = id;
		this.artType = artType;
		this.artName = artName;
		this.price = price;
	}


	@Override
	public String toString() {
		return "ArtType [id=" + id + ", artType=" + artType + ", artName=" + artName + ", price=" + price + "]";
	}	
	
	
	
}
