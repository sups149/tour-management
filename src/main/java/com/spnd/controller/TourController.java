package com.spnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/tours")
public class TourController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getTours() {
		return "mytours";
	}
}
