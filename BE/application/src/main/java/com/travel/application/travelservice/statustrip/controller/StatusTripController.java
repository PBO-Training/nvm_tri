package com.travel.application.travelservice.statustrip.controller;

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
import com.travel.application.travelservice.statustrip.dto.StatusTripRequest;
import com.travel.application.travelservice.statustrip.service.StatusTripService;

@RestController
@CrossOrigin
@RequestMapping("statustrip")
public class StatusTripController {
	@Autowired
	public StatusTripService service;

	@PostMapping("/save")
	@ResponseBody
	String save(@RequestBody StatusTripRequest req) {
		service.save(req);
		return "Success";
	}
	
	@GetMapping("/getall")
	@ResponseBody
	public ResponseEntity<?> getAll() {
		BaseResponse rep = service.getAll();
		return new ResponseEntity<>(rep,HttpStatus.OK);

	};
	
	@GetMapping("/getbyid")
	
	@ResponseBody
	public ResponseEntity<?>getByID(@RequestBody StatusTripRequest req)
	{
		BaseResponse rep = service.getByID(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
	
}
