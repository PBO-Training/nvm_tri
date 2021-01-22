package com.travel.application.travelservice.ticket.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.TicketEntity;
@Repository
public interface IRepoTicket extends JpaRepository<TicketEntity, Long>{

}
