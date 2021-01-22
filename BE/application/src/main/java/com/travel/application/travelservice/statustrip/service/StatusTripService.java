package com.travel.application.travelservice.statustrip.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.statustrip.dto.StatusTripRequest;

public interface StatusTripService {
	void save (StatusTripRequest req);
	BaseResponse getAll();

	BaseResponse getByID(StatusTripRequest req);
}
