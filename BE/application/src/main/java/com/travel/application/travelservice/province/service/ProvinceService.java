package com.travel.application.travelservice.province.service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.province.dto.ListProvinceRequest;
import com.travel.application.travelservice.province.dto.ProvinceRequest;



public interface ProvinceService {
	void save(ProvinceRequest requestList);

	void savelist(ListProvinceRequest listCreateProvinceRequest);
	
	BaseResponse get();
	BaseResponse getid(ProvinceRequest ProvinceRequest);
	void update( ProvinceRequest updateProvinceRequest);

}
