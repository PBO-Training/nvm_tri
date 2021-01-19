package com.travel.application.travelservice.createtrip.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.createtrip.dto.CreateTripRequest;

public interface CreateTripService {
	BaseResponse create(CreateTripRequest req);

}
