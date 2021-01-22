package com.travel.application.travelservice.statusticket.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.StatusTicketEntity;
@Repository
public interface IRepoStatusTicket  extends JpaRepository<StatusTicketEntity, Long>{

}
