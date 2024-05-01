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
@Table(name = "customeritem")
public class CustomerItem{
	
	
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String name;
	private String email;
	private String buissitem;	
	private String buissdesc;	
	private int cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBuissitem() {
		return buissitem;
	}

	public void setBuissitem(String buissitem) {
		this.buissitem = buissitem;
	}

	public String getBuissdesc() {
		return buissdesc;
	}

	public void setBuissdesc(String buissdesc) {
		this.buissdesc = buissdesc;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
	
	
	
	
	

}
