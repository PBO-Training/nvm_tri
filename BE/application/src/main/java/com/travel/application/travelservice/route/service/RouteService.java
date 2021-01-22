package com.travel.application.travelservice.route.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.route.dto.RouteRequest;

public interface RouteService {
	void save(RouteRequest requestList);
	public BaseResponse getAll();
	public BaseResponse getProvinceStart(RouteRequest req);
	public BaseResponse getbyId(RouteRequest req);
	

}
