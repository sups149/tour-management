package com.spnd.dto;

public class TouristDTO {
	String id;
	String name;
	float age;
	
	
	
	public TouristDTO(String id, String name, float age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public TouristDTO() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	
}
