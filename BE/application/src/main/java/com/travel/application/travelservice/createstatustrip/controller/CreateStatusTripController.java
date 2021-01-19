package com.travel.application.travelservice.createstatustrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.createstatustrip.dto.CreateStatusTripRequest;
import com.travel.application.travelservice.createstatustrip.service.CreateStatusTripService;

@RestController
@CrossOrigin
@RequestMapping("/statustrip")
public class CreateStatusTripController {
	@Autowired
	CreateStatusTripService repo;

	@PostMapping("/save")
	@ResponseBody
	String save(@RequestBody CreateStatusTripRequest req) {
		repo.save(req);
		return "Success";
	}
}
