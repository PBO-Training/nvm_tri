package com.travel.application.travelservice.ticket.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.ticket.dto.TicketRequest;

public interface TicketService {

	void save(TicketRequest req);
	BaseResponse getAll();
	BaseResponse getByID(TicketRequest req);
	BaseResponse getByTripID(TicketRequest req);
}
