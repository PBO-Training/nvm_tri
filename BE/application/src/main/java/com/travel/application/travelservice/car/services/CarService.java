package com.travel.application.travelservice.car.services;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.car.dto.CarRequest;

public interface CarService {

	void save(CarRequest req);

	BaseResponse getAll();

	BaseResponse getByID(CarRequest req);
	


}
