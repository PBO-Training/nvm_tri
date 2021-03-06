package com.travel.application.travelservice.route.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.entity.RouteEntity;

@Repository
public interface IRepoRoute extends JpaRepository<RouteEntity, Long> {
		// Use Query
//	@Query(value="select * from route where province_start = ?1", nativeQuery = true)
//	public RouteEntity findRouteByProvinceStart(int provinceStart);
		// Use JPA repo
	public RouteEntity findRouteByProvinceStart(ProvinceEntity provinceStart);
	
	
}
