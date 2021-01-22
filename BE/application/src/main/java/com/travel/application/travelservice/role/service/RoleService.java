package com.travel.application.travelservice.role.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.role.dto.RoleRequest;

public interface RoleService {
	void save(RoleRequest req);
	BaseResponse getAll();
	BaseResponse getByID(RoleRequest req);
}
