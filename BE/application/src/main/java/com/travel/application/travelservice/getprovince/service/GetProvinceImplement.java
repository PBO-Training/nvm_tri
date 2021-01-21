package com.travel.application.travelservice.getprovince.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.ProvinceEntity;
import com.travel.application.travelservice.getprovince.dto.GetProvinceReponse;
import com.travel.application.travelservice.getprovince.dto.GetProvinceRequest;


@Service
public class GetProvinceImplement implements GetProvinceService {
	@Autowired
	public IRepoGetProvince repo;
	
	

	@Override
	public BaseResponse get() {
		BaseResponse cmRep = new BaseResponse();
		List<ProvinceEntity> listProvince = repo.findAll();
//		Page<ProvinceEntity> page =repo.findAll(PageRequest.of(1, 5));
		if (listProvince.isEmpty()) {
			cmRep.setError("ko ton tai");
			return cmRep;
		}
		List<GetProvinceReponse> rep = listProvince.stream().map(GetProvinceReponse::new).collect(Collectors.toList());
	//	List<GetProvinceReponse> rep= page.stream().map(GetProvinceReponse::new).collect(Collectors.toList());
		/*
		 * 	List<GetProvinceReponse> xxx = new ArrayList<>();
		 * for(int i = 0; i < listProvince.size(); i++) { xxx.add(new
		 * GetProvinceReponse(listProvince.get(i)));
		 * 
		 * }
		 */
//		System.out.println(xxx);
		
		cmRep.setContent(rep);
		return cmRep;
	}


	@Override
	public BaseResponse getid(GetProvinceRequest GetProvinceRequest ) {
		// TODO Auto-generated method stub
		BaseResponse cmRes = new BaseResponse();
		Optional<ProvinceEntity> listProvince = repo.findById(GetProvinceRequest.getProvinceID());
		if(listProvince.isEmpty())
		{
			cmRes.setError("ko ton tai");
			return cmRes;
		}
		GetProvinceRequest rep = new GetProvinceRequest();
		rep.setProvinceID(listProvince.get().getProvinceID());
		rep.setCode(listProvince.get().getCode());
		rep.setName(listProvince.get().getName());
		cmRes.setContent(rep);
		return cmRes;
	}


	

}
