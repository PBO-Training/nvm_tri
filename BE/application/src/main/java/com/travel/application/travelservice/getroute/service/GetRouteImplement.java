package com.travel.application.travelservice.getroute.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.ProvinceEntity;
import com.travel.application.entity.RouteEntity;
import com.travel.application.travelservice.getprovince.service.IRepoGetProvince;
import com.travel.application.travelservice.getroute.dto.GetRouteRequest;
import com.travel.application.travelservice.getroute.dto.GetRouteResponse;

@Service
public class GetRouteImplement implements GetRouteService {
	@Autowired
	public IRepoGetRoute repo;

	@Autowired
	public IRepoGetProvince repoProvine;

	@Override
	public BaseResponse getAll() {

		BaseResponse cmRep = new BaseResponse();
		List<RouteEntity> list = repo.findAll();
		if (list.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<GetRouteResponse> rep = list.stream().map(GetRouteResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		// TODO Auto-generated method stub
		return cmRep;
	}

	@Override
	public BaseResponse getProvinceStart(GetRouteRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<ProvinceEntity> provinceStart = repoProvine.findById(req.getProvinceStart());
	// Use JPArepository	
		RouteEntity list = repo.findRouteByProvinceStart(provinceStart.get());
	// Use Query
//	RouteEntity list = repo.findRouteByProvinceStart(provinceStart.get().getProvinceID());

		GetRouteResponse response = new GetRouteResponse();
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
	public BaseResponse getbyId(GetRouteRequest req) {
		// TODO Auto-generated method stub

		BaseResponse cmRes = new BaseResponse();
		GetRouteResponse response = new GetRouteResponse();
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
