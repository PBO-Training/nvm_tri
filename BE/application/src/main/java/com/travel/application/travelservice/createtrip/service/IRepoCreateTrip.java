package com.travel.application.travelservice.createtrip.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.TripEntity;
@Repository
public interface IRepoCreateTrip  extends JpaRepository<TripEntity, Long>{

}
