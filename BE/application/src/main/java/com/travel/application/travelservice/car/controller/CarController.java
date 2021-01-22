package com.travel.application.travelservice.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.car.dto.CarRequest;
import com.travel.application.travelservice.car.services.CarService;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {

	@Autowired
	public CarService repo;
	

	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody CarRequest req) {
	repo.save(req);
		return "success";
	}
	
	@GetMapping("/getall")
	@ResponseBody
	public ResponseEntity<?> getAll()
	{
		BaseResponse rep = repo.getAll();
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
	@GetMapping("/getbyid")
	
	@ResponseBody
	public ResponseEntity<?>getByID(@RequestBody CarRequest req)
	{
		BaseResponse rep = repo.getByID(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
	
}
