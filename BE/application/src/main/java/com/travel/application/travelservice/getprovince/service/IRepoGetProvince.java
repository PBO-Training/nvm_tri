package com.travel.application.travelservice.getprovince.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;

@Repository
public interface IRepoGetProvince extends JpaRepository<ProvinceEntity, Integer> {

}
