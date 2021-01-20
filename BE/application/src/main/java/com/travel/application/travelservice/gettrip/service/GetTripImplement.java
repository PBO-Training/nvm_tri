package com.travel.application.travelservice.gettrip.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.TripEntity;
import com.travel.application.travelservice.gettrip.dto.GetTripRequest;
import com.travel.application.travelservice.gettrip.dto.GetTripResponse;

@Service
public class GetTripImplement implements GetTripService {
	@Autowired
	IRepoGetTrip repo;

	@Override
	public BaseResponse getAll() {
		BaseResponse cmRep = new BaseResponse();
		List<TripEntity> list = repo.findAll();
		if(list.isEmpty())
		{
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		List<GetTripResponse> rep = list.stream().map(GetTripResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(GetTripRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<TripEntity> rep = repo.findById(req.getTripID());
		if(rep.isEmpty())
		{
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		GetTripResponse resp = new GetTripResponse();
		resp.setCarID(rep.get().getCar().getCarID());
		resp.setDate(rep.get().getDate());
		resp.setRouteID(rep.get().getRoute().getRouteID());
		resp.setStatusID(rep.get().getStatus().getStatusID());
		cmRep.setContent(resp);
		return cmRep;
	}

}
