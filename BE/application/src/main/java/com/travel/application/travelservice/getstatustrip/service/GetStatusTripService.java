package com.travel.application.travelservice.getstatustrip.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getstatustrip.dto.GetStatusTripRequest;

public interface GetStatusTripService {

	BaseResponse getAll();

	BaseResponse getByID(GetStatusTripRequest req);
}
