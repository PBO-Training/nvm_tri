package com.travel.application.travelservice.createstatustrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.StatusTripEntity;
import com.travel.application.travelservice.createstatustrip.dto.CreateStatusTripRequest;
@Service
public class CreateStatusTripImplement implements CreateStatusTripService {
@Autowired
public IRepoCreateStatusTrip repo;
	@Override
	public void save(CreateStatusTripRequest req) {
	
		StatusTripEntity entity = new StatusTripEntity();
		System.out.println(req.getName());
		entity.setName(req.getName());
		repo.save(entity);
	
	}

}
