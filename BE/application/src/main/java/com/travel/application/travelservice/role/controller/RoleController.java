package com.travel.application.travelservice.role.controller;

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
import com.travel.application.travelservice.role.dto.RoleRequest;
import com.travel.application.travelservice.role.service.RoleService;

@RestController
@CrossOrigin()
@RequestMapping("/role")
public class RoleController {
	@Autowired
	public RoleService service;

	@GetMapping("/getall")

	@ResponseBody
	public ResponseEntity <?>getAll() {
		BaseResponse list = service.getAll();
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping("/getbyid")
	@ResponseBody
	
	
	public ResponseEntity <?>getById(@RequestBody RoleRequest req) {
		BaseResponse list = service.getByID(req);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}
	
	@PostMapping("/save")
	@ResponseBody
	public String create(@RequestBody RoleRequest req) {
		service.save(req);
		return "succes";

	}
}
