package com.travel.application.travelservice.createstatustrip.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.application.entity.StatusTripEntity;

public interface IRepoCreateStatusTrip  extends JpaRepository<StatusTripEntity, Long>{

}
