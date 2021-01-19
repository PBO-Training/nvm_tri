package com.travel.application.travelservice.getroute.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getroute.dto.GetRouteRequest;

public interface GetRouteService {

	public BaseResponse getAll();
	public BaseResponse getProvinceStart(GetRouteRequest req);
	public BaseResponse getbyId(GetRouteRequest req);
	

}
