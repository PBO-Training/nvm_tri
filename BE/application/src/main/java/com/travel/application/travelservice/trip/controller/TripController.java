package com.travel.application.travelservice.trip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.trip.dto.TripRequest;
import com.travel.application.travelservice.trip.service.TripService;

@CrossOrigin
@RequestMapping("/trip")
public class TripController {

	@Autowired
	TripService service;

	@GetMapping("/getall")
	@ResponseBody
	public ResponseEntity<?> getAll() {
		BaseResponse rep = service.getAll();
		return new ResponseEntity<>(rep, HttpStatus.OK);

	}
	
	@GetMapping("/getbyid")
	@ResponseBody
	public ResponseEntity<?> getByID(TripRequest req)
	{
		BaseResponse  rep = service.getByID(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
}
