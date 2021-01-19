package com.travel.application.travelservice.getcar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.createcar.dto.CreateCarRequest;

@Service
public class GetCarImplement implements GetCarService {

	@Autowired
	public IRepoGetCar repo;

	@Override
	public BaseResponse getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseResponse getByID(CreateCarRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
