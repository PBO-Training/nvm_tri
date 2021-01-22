package com.travel.application.travelservice.province.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;

@Repository
public interface IRepoProvince extends JpaRepository<ProvinceEntity, Long> {

}
