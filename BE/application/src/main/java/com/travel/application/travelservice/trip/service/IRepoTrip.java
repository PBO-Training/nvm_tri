package com.travel.application.travelservice.trip.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.TripEntity;
@Repository
public interface IRepoTrip  extends JpaRepository<TripEntity, Long>{

	
}
