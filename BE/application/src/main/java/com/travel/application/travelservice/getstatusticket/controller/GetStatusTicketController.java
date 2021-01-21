package com.travel.application.travelservice.getstatusticket.controller;

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
import com.travel.application.travelservice.getstatusticket.dto.GetStatusTicketRequest;
import com.travel.application.travelservice.getstatusticket.service.GetStatusTicketService;
import com.travel.application.travelservice.getstatustrip.dto.GetStatusTripRequest;

@RestController
@CrossOrigin
@RequestMapping("statusticket")
public class GetStatusTicketController {
	@Autowired
	public GetStatusTicketService repo;

	@GetMapping("/getall")
	@ResponseBody
	public ResponseEntity<?> getAll() {
		BaseResponse rep = repo.getAll();
		return new ResponseEntity<>(rep,HttpStatus.OK);

	};
	
	@GetMapping("/getbyid")
	
	@ResponseBody
	public ResponseEntity<?>getByID(@RequestBody GetStatusTicketRequest req)
	{
		BaseResponse rep = repo.getByID(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
	
}
