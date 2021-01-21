package com.travel.application.travelservice.createroute.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.RouteEntity;

@Repository
public interface IRepoCreateRoute extends JpaRepository<RouteEntity, Long> {
	
}
