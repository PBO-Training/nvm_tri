package com.travel.application.travelservice.user.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.user.dto.UserRequest;

public interface UserService {

	BaseResponse getAll();
	BaseResponse getByID(UserRequest req);
}
