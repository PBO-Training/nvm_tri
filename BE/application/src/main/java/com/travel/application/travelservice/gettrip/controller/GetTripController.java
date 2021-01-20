package com.travel.application.travelservice.gettrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.gettrip.dto.GetTripRequest;
import com.travel.application.travelservice.gettrip.service.GetTripService;

@RestController
@CrossOrigin
@RequestMapping("/trip")
public class GetTripController {

	@Autowired
	GetTripService repo;

	@GetMapping("/getall")
	@ResponseBody
	public ResponseEntity<?> getAll() {
		BaseResponse rep = repo.getAll();
		return new ResponseEntity<>(rep, HttpStatus.OK);

	}
	
	@GetMapping("/getbyid")
	@ResponseBody
	public ResponseEntity<?> getByID(GetTripRequest req)
	{
		BaseResponse  rep = repo.getByID(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
}
