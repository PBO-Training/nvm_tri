package com.travel.application.travelservice.getrole.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getrole.dto.GetRoleRequest;

public interface GetRoleService {

	BaseResponse getAll();
	BaseResponse getByID(GetRoleRequest req);
}
