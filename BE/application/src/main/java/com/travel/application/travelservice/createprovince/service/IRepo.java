package com.travel.application.travelservice.createprovince.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;
@Repository
public interface IRepo  extends JpaRepository<ProvinceEntity, Long>{	

}
