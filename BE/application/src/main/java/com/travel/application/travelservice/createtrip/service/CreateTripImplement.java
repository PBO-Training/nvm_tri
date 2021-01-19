package com.travel.application.travelservice.createtrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.TripEntity;
import com.travel.application.travelservice.createtrip.dto.CreateTripRequest;

@Service
public class CreateTripImplement implements CreateTripService {
	@Autowired
	public IRepoCreateTrip repo;

	@Override
	public BaseResponse create(CreateTripRequest req) {
		TripEntity list = new TripEntity();
	//	list.setCar(req.getCarID());
		return null;
	}

}
