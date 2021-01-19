package com.travel.application.travelservice.getstatustrip.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.application.entity.StatusTripEntity;

public interface IRepoGetStatusTrip  extends JpaRepository<StatusTripEntity, Integer>{

}
