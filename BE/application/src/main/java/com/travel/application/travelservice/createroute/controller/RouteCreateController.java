package com.travel.application.travelservice.createroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.createroute.dto.CreateRouteRequest;
import com.travel.application.travelservice.createroute.service.CreateRouteService;


@RestController
@CrossOrigin()

@RequestMapping("/route")
public class RouteCreateController {

	@Autowired
	public CreateRouteService service;

	@PostMapping("/save")
	@ResponseBody
	public String create(@RequestBody CreateRouteRequest req) {
		service.save(req);
		return "succes";

	}
}
