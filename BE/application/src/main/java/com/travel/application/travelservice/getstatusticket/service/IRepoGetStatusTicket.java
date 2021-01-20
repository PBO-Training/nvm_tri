package com.travel.application.travelservice.getstatusticket.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.application.entity.StatusTicketEntity;

public interface IRepoGetStatusTicket  extends JpaRepository<StatusTicketEntity, Integer>{

}
