package com.travel.application.travelservice.createticket.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.TicketEntity;
@Repository
public interface IRepoCreateTicket extends JpaRepository<TicketEntity, Long>{

}
