package com.travel.application.travelservice.getstatusticket.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getstatusticket.dto.GetStatusTicketRequest;

public interface GetStatusTicketService {

	BaseResponse getAll();
	BaseResponse getByID(GetStatusTicketRequest req);
}
