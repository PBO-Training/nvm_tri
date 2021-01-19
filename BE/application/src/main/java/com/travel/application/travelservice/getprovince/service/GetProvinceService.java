package com.travel.application.travelservice.getprovince.service;

import java.util.List;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getprovince.dto.GetProvinceReponse;
import com.travel.application.travelservice.getprovince.dto.GetProvinceRequest;


public interface GetProvinceService {
	BaseResponse get();
	BaseResponse getid(GetProvinceRequest getProvinceRequest);

}
