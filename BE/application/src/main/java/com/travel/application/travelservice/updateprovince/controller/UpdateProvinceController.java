package com.travel.application.travelservice.updateprovince.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.travelservice.updateprovince.dto.UpdateProvinceRequest;
import com.travel.application.travelservice.updateprovince.service.UpdateProvinceService;

@RestController
@CrossOrigin()
@RequestMapping("/province")
public class UpdateProvinceController {
	@Autowired 
	public UpdateProvinceService  repo;
	
	
	@PutMapping("/update")
	@ResponseBody
	public String Update(@RequestBody  UpdateProvinceRequest UpdateProvinceRequest)
	{
		
		repo.update(UpdateProvinceRequest);
		return "update Success";
	}

}
