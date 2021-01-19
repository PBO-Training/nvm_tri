package com.travel.application.travelservice.getprovince.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.getprovince.dto.GetProvinceRequest;
import com.travel.application.travelservice.getprovince.service.GetProvinceService;

@RestController
@CrossOrigin()
@RequestMapping("/province")
public class GetProvinceController {
	@Autowired
	public GetProvinceService service;

	/*
	 * @GetMapping("/getall")
	 * 
	 * @ResponseBody public List<GetProvinceReponse> get() {
	 * List<GetProvinceReponse> list = service.get(); return list; }
	 */
	@GetMapping("/getall")

	@ResponseBody
	public ResponseEntity<?> getAll() {
		BaseResponse list = service.get();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getbyid")

	@ResponseBody
	public ResponseEntity<?> getId(@RequestBody GetProvinceRequest GetProvinceRequest) {
		BaseResponse list = service.getid(GetProvinceRequest);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
