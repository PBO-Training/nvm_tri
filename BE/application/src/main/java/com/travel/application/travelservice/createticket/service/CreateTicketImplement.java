package com.travel.application.travelservice.createticket.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.StatusTicketEntity;
import com.travel.application.entity.TicketEntity;
import com.travel.application.entity.TripEntity;
import com.travel.application.entity.UserEntity;
import com.travel.application.travelservice.createticket.dto.CreateTicketRequest;
import com.travel.application.travelservice.getstatusticket.service.IRepoGetStatusTicket;
import com.travel.application.travelservice.gettrip.service.IRepoGetTrip;
import com.travel.application.travelservice.getuser.service.IRepoGetUser;

@Service
public class CreateTicketImplement implements CreateTicketService{
@Autowired
public IRepoCreateTicket repo;
@Autowired
public IRepoGetTrip repoTrip;
@Autowired

public IRepoGetStatusTicket repoStatus;
@Autowired
public IRepoGetUser repoUser;

	@Override
	public void save(CreateTicketRequest req) {
		TicketEntity list = new TicketEntity();
		list.setDate(req.getDate());
		list.setTicketCode(req.getTicketCode());
		
		Optional<TripEntity> tripID = repoTrip.findById(req.getTripID());
		list.setTrip(tripID.get());
		list.setSeats(req.getSeat());
		list.setAmountSeat(req.getAmountSeats());
		list.setPrice(req.getPrice());
		if(!(req.getUserID()== null))
		{
			Optional<UserEntity> userID = repoUser.findById(req.getUserID());
			list.setUserId(userID.get());
		}
		
		Optional<StatusTicketEntity> statusID = repoStatus.findById(req.getStatusID());
		list.setStatus(statusID.get());
		
			repo.save(list)	;
	}

}
