package com.travel.application.travelservice.info.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.info.dto.InfoRequest;

public interface InfoService {

	void save(InfoRequest req);
	BaseResponse getAll();
	BaseResponse getByID(InfoRequest req);
	
}
