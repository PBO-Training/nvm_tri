package com.travel.application.travelservice.statustrip.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.application.entity.StatusTripEntity;

public interface IRepoStatusTrip  extends JpaRepository<StatusTripEntity, Long>{

}
