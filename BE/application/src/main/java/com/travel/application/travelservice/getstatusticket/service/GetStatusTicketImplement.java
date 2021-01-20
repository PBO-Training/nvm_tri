package com.travel.application.travelservice.getstatusticket.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.StatusTicketEntity;
import com.travel.application.travelservice.getstatusticket.dto.GetStatusTicketResponse;
import com.travel.application.travelservice.getstatustrip.dto.GetStatusResponse;
import com.travel.application.travelservice.getstatustrip.dto.GetStatusTripRequest;

@Service
public class GetStatusTicketImplement implements GetStatusTicketService {
	@Autowired
	public IRepoGetStatusTicket repo;

	@Override
	public BaseResponse getAll() {
		List<StatusTicketEntity> list = repo.findAll();
		BaseResponse cmRep = new BaseResponse();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<GetStatusTicketResponse> rep = list.stream().map(GetStatusTicketResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(GetStatusTripRequest req) {
		// TODO Auto-generated method stub
		Optional<StatusTicketEntity> list = repo.findById(req.getStatusID());
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
