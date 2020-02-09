package com.fdx.rtct.staticModule.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

	@RequestMapping(path = "/countries", method = RequestMethod.GET)
	List<String> getCountries(){
		System.out.println("Inside countries method");
		List<String> list = new ArrayList<>();
		list.add("India");
		list.add("Bhutan");
		list.add("China");
		return list;
		
		
	}
	
	
}
