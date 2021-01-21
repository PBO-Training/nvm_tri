package com.travel.application.travelservice.createstatusticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.createstatusticket.dto.CreateStatusTicketRequest;
import com.travel.application.travelservice.createstatusticket.service.CreateStatusTicketService;

@RestController
@CrossOrigin
@RequestMapping("/statusticket")
public class CreateStatusTicketController {
	@Autowired
	CreateStatusTicketService repo;

	@PostMapping("/save")
	@ResponseBody
	String save(@RequestBody CreateStatusTicketRequest req) {
		repo.save(req);
		return "Success";
	}
}
