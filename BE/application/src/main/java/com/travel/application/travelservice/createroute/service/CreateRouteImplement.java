package com.travel.application.travelservice.createroute.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.entity.RouteEntity;
import com.travel.application.travelservice.createroute.dto.CreateRouteRequest;
import com.travel.application.travelservice.getprovince.service.IRepoGetProvince;

@Service
public class CreateRouteImplement  implements CreateRouteService{
	@Autowired 
	public IRepoCreateRoute repo;
	@Autowired 
	public IRepoGetProvince repoget;

	@Override
	public void save(CreateRouteRequest requestList) {
		// TODO Auto-generated method stub
		RouteEntity routeEntity = new RouteEntity();
		routeEntity.setDepartureTime(requestList.getDepartureTime());
		routeEntity.setJourneyTime(requestList.getJourneyTime());
		routeEntity.setPrice(requestList.getPrice());
		Optional<ProvinceEntity> provinceStart =  repoget.findById(requestList.getProvinceStart());
		Optional<ProvinceEntity> provinceEnd =  repoget.findById(requestList.getProvinceEnd());
		routeEntity.setProvinceStart(provinceStart.get());
		routeEntity.setProvinceEnd(provinceEnd.get());
		repo.save(routeEntity);
	}

	
}
