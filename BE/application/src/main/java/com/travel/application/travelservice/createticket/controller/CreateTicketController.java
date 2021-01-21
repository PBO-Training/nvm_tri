package com.travel.application.travelservice.createticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.createticket.dto.CreateTicketRequest;
import com.travel.application.travelservice.createticket.service.CreateTicketService;
import com.travel.application.travelservice.createticket.service.IRepoCreateTicket;

@RestController
@CrossOrigin
@RequestMapping("/ticket")
public class CreateTicketController {
	@Autowired
	public CreateTicketService repo;

	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody CreateTicketRequest req)
	{
		repo.save(req);
		return "success";
	}

}
