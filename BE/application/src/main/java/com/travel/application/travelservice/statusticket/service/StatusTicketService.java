package com.travel.application.travelservice.statusticket.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.statusticket.dto.StatusTicketRequest;

public interface StatusTicketService {
	
	void save (StatusTicketRequest req);

	BaseResponse getAll();
	BaseResponse getByID(StatusTicketRequest req);
}
