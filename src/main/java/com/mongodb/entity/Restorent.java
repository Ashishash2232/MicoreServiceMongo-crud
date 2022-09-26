package com.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restorent")
public class Restorent {
	
	private int id;
	private String name;
	private String city;
	public Restorent(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
