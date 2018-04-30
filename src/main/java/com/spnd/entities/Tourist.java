package com.spnd.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="tourists")
public class Tourist {
	@Id
	private String id;
	
	@Field(value="name")
	private String name;
	
	
	private float age;


	
	
	public Tourist() {
	}


	public Tourist(String id, String name, float age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
