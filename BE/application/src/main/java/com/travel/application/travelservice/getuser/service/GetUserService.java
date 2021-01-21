package com.travel.application.travelservice.getuser.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getuser.dto.GetUserRequest;

public interface GetUserService {

	BaseResponse getAll();
	BaseResponse getByID(GetUserRequest req);
}
