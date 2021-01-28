package com.travel.application.travelservice.ticket.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.StatusTicketEntity;
import com.travel.application.entity.TicketEntity;
import com.travel.application.entity.TripEntity;
import com.travel.application.entity.UserEntity;
import com.travel.application.travelservice.statusticket.service.IRepoStatusTicket;
import com.travel.application.travelservice.ticket.dto.TicketRequest;
import com.travel.application.travelservice.trip.service.IRepoTrip;
import com.travel.application.travelservice.user.service.IRepoUser;

@Service
public class TicketImplement implements TicketService{
@Autowired
public IRepoTicket repo;
@Autowired
public IRepoTrip repoTrip;
@Autowired
public IRepoStatusTicket repoStatus;
@Autowired
public IRepoUser repoUser;

	@Override
	public void save(TicketRequest req) {
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
