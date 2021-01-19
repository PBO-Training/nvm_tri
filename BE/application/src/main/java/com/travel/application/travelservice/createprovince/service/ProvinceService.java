package com.travel.application.travelservice.createprovince.service;

import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;
import com.travel.application.travelservice.createprovince.dto.ListCreateProvinceRequest;


public interface ProvinceService {

	void save(CreateProvinceRequest requestList);

	void savelist(ListCreateProvinceRequest listCreateProvinceRequest);
}
