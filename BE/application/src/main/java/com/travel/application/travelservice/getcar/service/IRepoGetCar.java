package com.travel.application.travelservice.getcar.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.CarEntity;
@Repository
public interface IRepoGetCar  extends JpaRepository<CarEntity, Long>{

}
