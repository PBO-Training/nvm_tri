package com.travel.application.travelservice.province.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.province.dto.ListProvinceRequest;
import com.travel.application.travelservice.province.dto.ProvinceRequest;
import com.travel.application.travelservice.province.service.ProvinceService;

@RestController
@CrossOrigin()
@RequestMapping("/province")
public class ProvinceController {
	@Autowired
	public ProvinceService service;
	
	
	

	@PostMapping("/save")
	@ResponseBody
	public String create(@RequestBody ProvinceRequest CreateProvinceRequest) {
		service.save(CreateProvinceRequest);
		return "succes";

	}
	


	
	@PostMapping("/savelist")
	@ResponseBody
	public String create(@RequestBody ListProvinceRequest  ListCreateProvinceRequest) {
		service.savelist(ListCreateProvinceRequest);
		return "succes save list";

	}

	@PostMapping("/save/{code}/{name}")
	@ResponseBody
	public String create(@PathVariable("code") String code, @PathVariable("name") String name, Model model) {
		model.addAttribute("code", code);
		model.addAttribute("name", name);
		ProvinceRequest ProvinceRequest = new ProvinceRequest();
		ProvinceRequest.setCode(code);
		ProvinceRequest.setName(name);
		service.save(ProvinceRequest);
		return "succes";

	}

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
	public ResponseEntity<?> getId(@RequestBody ProvinceRequest ProvinceRequest) {
		BaseResponse list = service.getid(ProvinceRequest);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	@ResponseBody
	public String Update(@RequestBody  ProvinceRequest UpdateProvinceRequest)
	{
		
		service.update(UpdateProvinceRequest);
		return "update Success";
	}
	
	

}
