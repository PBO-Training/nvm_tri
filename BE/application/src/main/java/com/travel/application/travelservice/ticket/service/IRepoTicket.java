package com.travel.application.travelservice.ticket.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.TicketEntity;
import com.travel.application.entity.TripEntity;
@Repository
public interface IRepoTicket extends JpaRepository<TicketEntity, Long>{
	public List<TicketEntity> findTicketByTrip(TripEntity entity);
}
