package com.travel.application.travelservice.createcar.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.CarEntity;
@Repository
public interface IRepoCreateCar extends JpaRepository<CarEntity, Integer>{

}
