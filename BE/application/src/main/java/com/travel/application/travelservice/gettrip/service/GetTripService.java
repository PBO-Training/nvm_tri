package com.travel.application.travelservice.gettrip.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.gettrip.dto.GetTripRequest;

public interface GetTripService {
	BaseResponse getAll();
	BaseResponse getByID(GetTripRequest req);
	

}
