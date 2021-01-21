package com.travel.application.travelservice.getstatusticket.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.StatusTicketEntity;
import com.travel.application.travelservice.getstatusticket.dto.GetStatusTicketRequest;
import com.travel.application.travelservice.getstatusticket.dto.GetStatusTicketResponse;


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
	public BaseResponse getByID(GetStatusTicketRequest req) {
		// TODO Auto-generated method stub
		Optional<StatusTicketEntity> list = repo.findById(req.getStatusID());
		BaseResponse cmRep = new BaseResponse();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		GetStatusTicketResponse rep = new GetStatusTicketResponse();
		rep.setStatusID(list.get().getStatusID());
		rep.setName(list.get().getName());
		cmRep.setContent(rep);
		return cmRep;
	}

}
