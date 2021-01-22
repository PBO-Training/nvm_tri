package com.travel.application.travelservice.route.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.ProvinceEntity;
import com.travel.application.entity.RouteEntity;
import com.travel.application.travelservice.province.service.IRepoProvince;
import com.travel.application.travelservice.route.dto.RouteRequest;
import com.travel.application.travelservice.route.dto.RouteResponse;

@Service
public class RouteImplement implements RouteService {
	@Autowired
	public IRepoRoute repo;

	@Autowired
	public IRepoProvince repoProvine;



	@Override
	public void save(RouteRequest requestList) {
		// TODO Auto-generated method stub
		RouteEntity routeEntity = new RouteEntity();
		routeEntity.setDepartureTime(requestList.getDepartureTime());
		routeEntity.setJourneyTime(requestList.getJourneyTime());
		routeEntity.setPrice(requestList.getPrice());
		Optional<ProvinceEntity> provinceStart =  repoProvine.findById(requestList.getProvinceStart());
		Optional<ProvinceEntity> provinceEnd =  repoProvine.findById(requestList.getProvinceEnd());
		routeEntity.setProvinceStart(provinceStart.get());
		routeEntity.setProvinceEnd(provinceEnd.get());
		repo.save(routeEntity);
	}

	@Override
	public BaseResponse getAll() {

		BaseResponse cmRep = new BaseResponse();
		List<RouteEntity> list = repo.findAll();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<RouteResponse> rep = list.stream().map(RouteResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		// TODO Auto-generated method stub
		return cmRep;
	}

	@Override
	public BaseResponse getProvinceStart(RouteRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<ProvinceEntity> provinceStart = repoProvine.findById(req.getProvinceStart());
	// Use JPArepository	
		RouteEntity list = repo.findRouteByProvinceStart(provinceStart.get());
	// Use Query
//	RouteEntity list = repo.findRouteByProvinceStart(provinceStart.get().getProvinceID());

		RouteResponse response = new RouteResponse();
		response.setDepartureTime(list.getDepartureTime());
		response.setJourneyTime(list.getJourneyTime());
		response.setPrice(list.getPrice());
		response.setProvinceStart(list.getProvinceStart().getProvinceID());
		response.setProvinceEnd(list.getProvinceEnd().getProvinceID());
		response.setRooteID(list.getRouteID());
		cmRep.setContent(response);
		return cmRep;

	}

	@Override
	public BaseResponse getbyId(RouteRequest req) {
		// TODO Auto-generated method stub

		BaseResponse cmRes = new BaseResponse();
		RouteResponse response = new RouteResponse();
		Optional<RouteEntity> listRoute = repo.findById(req.getRooteID());
		if (listRoute.isEmpty()) {
			cmRes.setError("ko ton tai");
			return cmRes;
		}

		response.setRooteID(listRoute.get().getRouteID());
		response.setDepartureTime(listRoute.get().getDepartureTime());
		response.setJourneyTime(listRoute.get().getJourneyTime());
		response.setPrice(listRoute.get().getPrice());
		response.setProvinceStart(listRoute.get().getProvinceStart().getProvinceID());
		response.setProvinceEnd(listRoute.get().getProvinceEnd().getProvinceID());
		cmRes.setContent(response);
		return cmRes;
	}

}
