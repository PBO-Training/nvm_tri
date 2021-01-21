package com.travel.application.travelservice.createrole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.createrole.dto.CreateRoleRequest;
import com.travel.application.travelservice.createrole.service.CreateRoleService;
@RestController
@CrossOrigin()

@RequestMapping("/role")
public class CreateRoleController {

	@Autowired
	public CreateRoleService service;

	@PostMapping("/save")
	@ResponseBody
	public String create(@RequestBody CreateRoleRequest req) {
		service.save(req);
		return "succes";

	}
}
