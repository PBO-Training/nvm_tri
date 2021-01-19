package com.travel.application.travelservice.getroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getroute.dto.GetRouteRequest;
import com.travel.application.travelservice.getroute.service.GetRouteService;

@RestController
@CrossOrigin()
@RequestMapping("/route")
public class GetRouteController {
	@Autowired
	public GetRouteService repo;

	@GetMapping("/getall")

	@ResponseBody
	public ResponseEntity <?>getAll() {
		BaseResponse list = repo.getAll();
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping("/getbyprovincestart")
	@ResponseBody
	
	
	public ResponseEntity <?>getProvinceStart(@RequestBody GetRouteRequest req) {
		BaseResponse list = repo.getProvinceStart(req);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}
	@GetMapping("/getbyid")
	@ResponseBody
	
	
	public ResponseEntity <?>getById(@RequestBody GetRouteRequest req) {
		BaseResponse list = repo.getbyId(req);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

}
