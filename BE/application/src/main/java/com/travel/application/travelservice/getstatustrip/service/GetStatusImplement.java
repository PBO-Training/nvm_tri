package com.travel.application.travelservice.getstatustrip.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.StatusTripEntity;
import com.travel.application.travelservice.getstatustrip.dto.GetStatusResponse;
import com.travel.application.travelservice.getstatustrip.dto.GetStatusTripRequest;

@Service
public class GetStatusImplement implements GetStatusTripService {
	@Autowired
	public IRepoGetStatusTrip repo;

	@Override
	public BaseResponse getAll() {
		List<StatusTripEntity> list = repo.findAll();
		BaseResponse cmRep = new BaseResponse();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<GetStatusResponse> rep = list.stream().map(GetStatusResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(GetStatusTripRequest req) {
		// TODO Auto-generated method stub
		Optional<StatusTripEntity> list = repo.findById(req.getStatusID());
		BaseResponse cmRep = new BaseResponse();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		GetStatusResponse rep = new GetStatusResponse();
		rep.setStatusID(list.get().getStatusID());
		rep.setName(list.get().getName());
		cmRep.setContent(rep);
		return cmRep;
	}

}
