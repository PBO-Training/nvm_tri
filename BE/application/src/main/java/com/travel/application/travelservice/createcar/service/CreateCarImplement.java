package com.travel.application.travelservice.createcar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.CarEntity;
import com.travel.application.travelservice.createcar.dto.CreateCarRequest;

@Service
public class CreateCarImplement implements CreateCarService {

	@Autowired
	public IRepoCreateCar repo;

	@Override
	public void save(CreateCarRequest req) {
	
		CarEntity rep = new CarEntity();
		rep.setCode(req.getCode());
		rep.setName(req.getName());
		rep.setLicensePlates(req.getLicensePlates());
		rep.setPrice(req.getPrice());
		rep.setAmount(req.getAmount());
		repo.save(rep);
	}

}
