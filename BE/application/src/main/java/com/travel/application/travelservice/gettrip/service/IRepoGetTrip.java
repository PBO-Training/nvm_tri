package com.travel.application.travelservice.gettrip.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.TripEntity;
@Repository
public interface IRepoGetTrip  extends JpaRepository<TripEntity, Long>{

	
}
