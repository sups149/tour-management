package com.spnd.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spnd.entities.Tourist;

public interface TouristRepository extends MongoRepository<Tourist, String> {
	
}
