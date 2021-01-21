package com.travel.application.travelservice.createstatusticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.StatusTicketEntity;
import com.travel.application.travelservice.createstatusticket.dto.CreateStatusTicketRequest;
@Service
public class CreateStatusTicketImplement implements CreateStatusTicketService {
@Autowired
public IRepoCreateStatusTicket repo;
	@Override
	public void save(CreateStatusTicketRequest req) {
	
		StatusTicketEntity entity = new StatusTicketEntity();
		System.out.println(req.getName());
		entity.setName(req.getName());
		repo.save(entity);
	
	}

}
