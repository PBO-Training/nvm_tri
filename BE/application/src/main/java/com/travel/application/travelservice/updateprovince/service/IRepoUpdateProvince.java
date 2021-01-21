package com.travel.application.travelservice.updateprovince.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.ProvinceEntity;
@Repository
public interface IRepoUpdateProvince  extends JpaRepository<ProvinceEntity, Long>{
	
	

}
	