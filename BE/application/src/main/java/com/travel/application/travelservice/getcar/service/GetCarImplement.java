package com.travel.application.travelservice.getcar.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.CarEntity;
import com.travel.application.travelservice.createcar.dto.CreateCarRequest;
import com.travel.application.travelservice.getcar.dto.GetCarResponse;

@Service
public class GetCarImplement implements GetCarService {

	@Autowired
	public IRepoGetCar repo;

	@Override
	public BaseResponse getAll() {
		BaseResponse cmRep = new BaseResponse();
		List<CarEntity> list = repo.findAll();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<GetCarResponse> rep = list.stream().map(GetCarResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(CreateCarRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<CarEntity> rep = repo.findById(req.getCarID());
		if(rep.isEmpty())
		{
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		GetCarResponse resp = new GetCarResponse();
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
