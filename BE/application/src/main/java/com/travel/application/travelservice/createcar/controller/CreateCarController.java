package com.travel.application.travelservice.createcar.controller;

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
import com.travel.application.travelservice.createcar.dto.CreateCarRequest;
import com.travel.application.travelservice.createcar.service.CreateCarService;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CreateCarController {

	@Autowired
	public CreateCarService repo;

	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody CreateCarRequest req) {
	repo.save(req);
		return "success";
	}
}
