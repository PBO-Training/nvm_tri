package com.travel.application.travelservice.createtrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.createtrip.dto.CreateTripRequest;
import com.travel.application.travelservice.createtrip.service.CreateTripService;

@RestController
@CrossOrigin
@RequestMapping("/trip")
public class CreateTripController {
	@Autowired
	public CreateTripService repo;

	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody CreateTripRequest req)
	{
		repo.save(req);
		return "success";
	}
	
}
