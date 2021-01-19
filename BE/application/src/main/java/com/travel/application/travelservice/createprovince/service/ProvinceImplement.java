package com.travel.application.travelservice.createprovince.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.createprovince.dto.CreateProvinceRequest;
import com.travel.application.travelservice.createprovince.dto.ListCreateProvinceRequest;

@Service
public class ProvinceImplement implements ProvinceService {
	@Autowired
	public IRepo repo;

	@Override
	public void save(CreateProvinceRequest requestList) {

		ProvinceEntity province = new ProvinceEntity();
		province.setCode(requestList.getCode());
		province.setName(requestList.getName());
		repo.save(province);

	}

	@Override
	public void savelist(ListCreateProvinceRequest listCreateProvinceRequest) {
		// TODO Auto-generated method stub

		for (int i = 0; i < listCreateProvinceRequest.getListCreateProvinceRequest().size(); i++) {
			ProvinceEntity provinceEntity = new ProvinceEntity();
			provinceEntity.setCode(listCreateProvinceRequest.getListCreateProvinceRequest().get(i).getCode());
			provinceEntity.setName(listCreateProvinceRequest.getListCreateProvinceRequest().get(i).getName());
			repo.save(provinceEntity);

		}
	}

	

}
