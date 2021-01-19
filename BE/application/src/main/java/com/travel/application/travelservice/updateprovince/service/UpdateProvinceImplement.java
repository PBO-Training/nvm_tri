package com.travel.application.travelservice.updateprovince.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.updateprovince.dto.UpdateProvinceRequest;

@Service
public class UpdateProvinceImplement implements UpdateProvinceService {
	@Autowired
	public IRepoUpdateProvince repo;

	@Override
	public void update(UpdateProvinceRequest updateProvinceRequest) {
		Optional<ProvinceEntity> province = repo.findById(updateProvinceRequest.getProvinceID());
		province.get().setCode(updateProvinceRequest.getCode());
		province.get().setName(updateProvinceRequest.getName());
		repo.save(province.get());

	}

}
