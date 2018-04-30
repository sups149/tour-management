package com.spnd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spnd.dto.TouristDTO;
import com.spnd.entities.Tourist;
import com.spnd.repositories.TouristRepository;

@RestController
@RequestMapping("/tourmanager")
public class TourManagementController {
	
	@Autowired
	private TouristRepository touristRepository;
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path="/tourists", method=RequestMethod.POST)
	public void addTourist(@RequestBody TouristDTO tourist) {
		Tourist touristEntity = transformTourist(tourist);
		touristRepository.save(touristEntity);
	}
	
	@RequestMapping(path="/tourists", method=RequestMethod.GET)
	public List<TouristDTO> getTouristList() {
		List<TouristDTO> touristList = new ArrayList<TouristDTO>();
		List<Tourist> touristEntityList = touristRepository.findAll();
		
		touristEntityList.forEach(tourist -> {
			touristList.add(new TouristDTO(tourist.getId(), tourist.getName(), tourist.getAge()));
		});
		
		return touristList;
	}
	
	@RequestMapping(path="/tourists/{id}", method=RequestMethod.GET)
	public TouristDTO getTouristList(@PathVariable(value="id")String id) {
		Tourist touristEntity = touristRepository.findOne(id);
		
		return new TouristDTO(touristEntity.getId(), touristEntity.getName(), touristEntity.getAge());
	}
	
	

	private Tourist transformTourist(TouristDTO tourist) {
		return new Tourist(tourist.getId(), tourist.getName(), tourist.getAge());
	}
	
	
}
