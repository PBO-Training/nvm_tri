package com.travel.application.travelservice.getstatusticket.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.StatusTicketEntity;
@Repository
public interface IRepoGetStatusTicket  extends JpaRepository<StatusTicketEntity, Long>{

}
