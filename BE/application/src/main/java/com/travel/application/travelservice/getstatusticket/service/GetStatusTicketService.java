package com.travel.application.travelservice.getstatusticket.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getstatustrip.dto.GetStatusTripRequest;

public interface GetStatusTicketService {

	BaseResponse getAll();

	BaseResponse getByID(GetStatusTripRequest req);
}
