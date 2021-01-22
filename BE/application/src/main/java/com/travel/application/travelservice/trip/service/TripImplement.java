package com.travel.application.travelservice.trip.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.CarEntity;
import com.travel.application.entity.RouteEntity;
import com.travel.application.entity.StatusTripEntity;
import com.travel.application.entity.TripEntity;
import com.travel.application.travelservice.car.services.IRepoCar;
import com.travel.application.travelservice.route.service.IRepoRoute;
import com.travel.application.travelservice.statustrip.service.IRepoStatusTrip;
import com.travel.application.travelservice.trip.dto.TripRequest;
import com.travel.application.travelservice.trip.dto.TripResponse;

@Service
public class TripImplement implements TripService {
	@Autowired
	IRepoTrip repo;
	@Autowired
	public IRepoCar repoCar;
	@Autowired
	public IRepoRoute repoRoute;
	@Autowired
	public IRepoStatusTrip repoStatusTrip;
	
	
	@Override
	public void save(TripRequest req) {

		TripEntity list = new TripEntity();
		list.setDate(req.getDate());
		Optional<CarEntity> carID = repoCar.findById(req.getCarID());
		Optional<RouteEntity> routeID = repoRoute.findById(req.getRouteID());
		Optional<StatusTripEntity> statusID = repoStatusTrip.findById(req.getStatusID());
		list.setCar(carID.get());
		list.setRoute(routeID.get());
		list.setStatus(statusID.get());
		repo.save(list);

	}
	@Override
	public BaseResponse getAll() {
		BaseResponse cmRep = new BaseResponse();
		List<TripEntity> list = repo.findAll();
		if(list.isEmpty())
		{
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		List<TripResponse> rep = list.stream().map(TripResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(TripRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<TripEntity> rep = repo.findById(req.getTripID());
		if(rep.isEmpty())
		{
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		TripResponse resp = new TripResponse();
		resp.setCarID(rep.get().getCar().getCarID());
		resp.setDate(rep.get().getDate());
		resp.setRouteID(rep.get().getRoute().getRouteID());
		resp.setStatusID(rep.get().getStatus().getStatusID());
		cmRep.setContent(resp);
		return cmRep;
	}

}
