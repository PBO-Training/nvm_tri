package com.travel.application.travelservice.ticket.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.StatusTicketEntity;
import com.travel.application.entity.TicketEntity;
import com.travel.application.entity.TripEntity;
import com.travel.application.entity.UserEntity;
import com.travel.application.travelservice.statusticket.service.IRepoStatusTicket;
import com.travel.application.travelservice.ticket.dto.TicketRequest;
import com.travel.application.travelservice.ticket.dto.TicketResponse;
import com.travel.application.travelservice.trip.service.IRepoTrip;
import com.travel.application.travelservice.user.service.IRepoUser;

@Service
public class TicketImplement implements TicketService {
	@Autowired
	public IRepoTicket repo;
	@Autowired
	public IRepoTrip repoTrip;
	@Autowired
	public IRepoStatusTicket repoStatus;
	@Autowired
	public IRepoUser repoUser;
	@Autowired
	public TicketSearchProcess process;

	@Override
	public void save(TicketRequest req) {
		TicketEntity list = new TicketEntity();
		list.setDate(req.getDateBuyTicket());
		list.setTicketCode(req.getTicketCode());

		Optional<TripEntity> tripID = repoTrip.findById(req.getTripID());
		list.setTrip(tripID.get());
		list.setSeats(req.getSeat());
		list.setAmountSeat(req.getAmountSeats());
		list.setPrice(req.getPrice());
		if (!(req.getUserID() == null)) {
			Optional<UserEntity> userID = repoUser.findById(req.getUserID());
			list.setUserId(userID.get());
		}

		Optional<StatusTicketEntity> statusID = repoStatus.findById(req.getStatusID());
		list.setStatus(statusID.get());

		repo.save(list);
	}

	@Override
	public BaseResponse getAll() {
		// TODO Auto-generated method stub
		BaseResponse cmRep = new BaseResponse();
		List<TicketEntity> list = repo.findAll();
		if (list.isEmpty()) {
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		List<TicketResponse> rep = list.stream().map(TicketResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(TicketRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<TicketEntity> rep = repo.findById(req.getTicketID());
		if (rep.isEmpty()) {
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		TicketResponse resp = new TicketResponse();
		resp.setTicketID(rep.get().getTicketID());
		resp.setTicketCode(rep.get().getTicketCode());
		resp.setDate(rep.get().getDate());
		resp.setSeat(rep.get().getSeats());
		resp.setTripID(rep.get().getTrip().getTripID());
		resp.setPrice(rep.get().getPrice());
		resp.setStatusID(rep.get().getStatus().getStatusID());
		if (!(rep.get().getUserId() == null)) {
			resp.setUserID(rep.get().getUserId().getUserID());
		} else {
			resp.setUserID((long) 0);
		}

		cmRep.setContent(resp);
		return cmRep;
	}

	@Override
	public BaseResponse getByTripID(TicketRequest req) {
		// TODO Auto-generated method stub
		BaseResponse cmRep = new BaseResponse();
		Optional<TripEntity> Trip = repoTrip.findById(req.getTripID());
		List<TicketEntity> resp = repo.findTicketByTrip(Trip.get());
		if (resp.isEmpty()) {
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		List<TicketResponse> rep = resp.stream().map(TicketResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;

	}

	@Override
	public BaseResponse getHistoryTicket(TicketRequest req) {
		BaseResponse cmRep = new BaseResponse();
		String Query = process.createQueryString(req);
		cmRep = process.setDataQuery(Query, req);
		return cmRep;
	}

}
