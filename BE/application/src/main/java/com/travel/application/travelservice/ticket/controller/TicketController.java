package com.travel.application.travelservice.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.ticket.dto.TicketRequest;
import com.travel.application.travelservice.ticket.service.TicketService;

@RestController
@CrossOrigin
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	public TicketService service;

	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody TicketRequest req)
	{
		service.save(req);
		return "success";
	}

}
