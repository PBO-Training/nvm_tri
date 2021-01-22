package com.travel.application.travelservice.route.controller;

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
import com.travel.application.travelservice.route.dto.RouteRequest;
import com.travel.application.travelservice.route.service.RouteService;

@RestController
@CrossOrigin()
@RequestMapping("/route")
public class RouteController {
	@Autowired
	public RouteService service;
	
	@PostMapping("/save")
	@ResponseBody
	public String create(@RequestBody RouteRequest req) {
		service.save(req);
		return "succes";

	}

	@GetMapping("/getall")

	@ResponseBody
	public ResponseEntity <?>getAll() {
		BaseResponse list = service.getAll();
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping("/getbyprovincestart")
	@ResponseBody
	
	
	public ResponseEntity <?>getProvinceStart(@RequestBody RouteRequest req) {
		BaseResponse list = service.getProvinceStart(req);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}
	@GetMapping("/getbyid")
	@ResponseBody
	
	
	public ResponseEntity <?>getById(@RequestBody RouteRequest req) {
		BaseResponse list = service.getbyId(req);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

}
