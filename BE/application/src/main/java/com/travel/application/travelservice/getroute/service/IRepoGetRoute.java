package com.travel.application.travelservice.getroute.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.entity.RouteEntity;

@Repository
public interface IRepoGetRoute extends JpaRepository<RouteEntity, Integer> {
		// Use Query
//	@Query(value="select * from route where province_start = ?1", nativeQuery = true)
//	public RouteEntity findRouteByProvinceStart(int provinceStart);
		// Use JPA repo
	public RouteEntity findRouteByProvinceStart(ProvinceEntity provinceStart);
}
