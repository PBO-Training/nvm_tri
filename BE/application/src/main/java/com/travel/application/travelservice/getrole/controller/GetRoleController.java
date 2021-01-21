package com.travel.application.travelservice.getrole.controller;

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
import com.travel.application.travelservice.getrole.dto.GetRoleRequest;
import com.travel.application.travelservice.getrole.service.GetRoleService;

@RestController
@CrossOrigin()
@RequestMapping("/role")
public class GetRoleController {
	@Autowired
	public GetRoleService repo;

	@GetMapping("/getall")

	@ResponseBody
	public ResponseEntity <?>getAll() {
		BaseResponse list = repo.getAll();
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping("/getbyid")
	@ResponseBody
	
	
	public ResponseEntity <?>getById(@RequestBody GetRoleRequest req) {
		BaseResponse list = repo.getByID(req);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}
}
