package com.travel.application.travelservice.createtrip.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.CarEntity;
import com.travel.application.entity.RouteEntity;
import com.travel.application.entity.StatusTripEntity;
import com.travel.application.entity.TripEntity;
import com.travel.application.travelservice.createtrip.dto.CreateTripRequest;
import com.travel.application.travelservice.getcar.service.IRepoGetCar;
import com.travel.application.travelservice.getroute.service.IRepoGetRoute;
import com.travel.application.travelservice.getstatustrip.service.IRepoGetStatusTrip;

@Service
public class CreateTripImplement implements CreateTripService {
	@Autowired
	public IRepoCreateTrip repo;
	@Autowired
	public IRepoGetCar repoCar;
	@Autowired
	public IRepoGetRoute repoRoute;
	@Autowired
	public IRepoGetStatusTrip repoStatusTrip;

	@Override
	public void save(CreateTripRequest req) {

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

}
