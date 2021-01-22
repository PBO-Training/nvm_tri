package com.travel.application.travelservice.car.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.CarEntity;
import com.travel.application.travelservice.car.dto.CarRequest;
import com.travel.application.travelservice.car.dto.CarResponse;

@Service
public class CarImplement implements CarService {

	@Autowired
	public IRepoCar repo;

	@Override
	public void save(CarRequest req) {
	
		CarEntity rep = new CarEntity();
		rep.setCode(req.getCode());
		rep.setName(req.getName());
		rep.setLicensePlates(req.getLicensePlates());
		rep.setPrice(req.getPrice());
		rep.setAmount(req.getAmount());
		repo.save(rep);
	}

	@Override
	public BaseResponse getAll() {
		BaseResponse cmRep = new BaseResponse();
		List<CarEntity> list = repo.findAll();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<CarResponse> rep = list.stream().map(CarResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(CarRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<CarEntity> rep = repo.findById(req.getCarID());
		if(rep.isEmpty())
		{
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		CarResponse resp = new CarResponse();
		resp.setCarID(rep.get().getCarID());
		resp.setCode(rep.get().getCode());
		resp.setName(rep.get().getName());
		resp.setLicensePlates(rep.get().getLicensePlates());
		resp.setAmount(rep.get().getAmount());
		resp.setPrice(rep.get().getPrice());
		cmRep.setContent(resp);
		return cmRep;
	}
	
}
