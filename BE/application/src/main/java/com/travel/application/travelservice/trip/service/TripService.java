package com.travel.application.travelservice.trip.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.trip.dto.TripRequest;

public interface TripService {
	void save(TripRequest req);
	BaseResponse getAll();
	BaseResponse getByID(TripRequest req);
	

}
