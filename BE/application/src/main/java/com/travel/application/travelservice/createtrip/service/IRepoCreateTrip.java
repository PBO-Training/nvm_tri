package com.travel.application.travelservice.createtrip.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.application.entity.TripEntity;

public interface IRepoCreateTrip  extends JpaRepository<TripEntity, Integer>{

}
