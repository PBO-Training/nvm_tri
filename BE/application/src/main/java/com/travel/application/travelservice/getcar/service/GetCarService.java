package com.travel.application.travelservice.getcar.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.createcar.dto.CreateCarRequest;

public interface GetCarService {
	BaseResponse getAll();

	BaseResponse getByID(CreateCarRequest req);
}
