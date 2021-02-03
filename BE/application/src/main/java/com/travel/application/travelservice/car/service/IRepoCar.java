package com.travel.application.travelservice.car.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.CarEntity;
@Repository
public interface IRepoCar extends JpaRepository<CarEntity, Long>{

}
