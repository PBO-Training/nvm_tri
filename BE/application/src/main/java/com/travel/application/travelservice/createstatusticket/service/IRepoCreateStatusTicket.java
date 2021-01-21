package com.travel.application.travelservice.createstatusticket.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.StatusTicketEntity;
@Repository
public interface IRepoCreateStatusTicket  extends JpaRepository<StatusTicketEntity, Long>{

}
