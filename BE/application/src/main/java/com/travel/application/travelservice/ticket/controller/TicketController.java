package com.travel.application.travelservice.ticket.controller;

import java.util.Date;
import java.util.List;
import java.util.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.travelservice.ticket.dto.MyTask;
import com.travel.application.travelservice.ticket.dto.SeatsDisable;
import com.travel.application.travelservice.ticket.dto.TicketRequest;
import com.travel.application.travelservice.ticket.service.TicketService;

@RestController
@CrossOrigin
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	public TicketService service ;

	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody TicketRequest req)
	{
		service.save(req);
		return "success";
	}
	@GetMapping("/getall")
	@ResponseBody
	public ResponseEntity<?> getAll() {
		BaseResponse rep = service.getAll();
		return new ResponseEntity<>(rep, HttpStatus.OK);

	}
	
	@PostMapping("/getbyid")
	@ResponseBody
	public ResponseEntity<?> getByID(@RequestBody TicketRequest req)
	{
		BaseResponse  rep = service.getByID(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
	
	@PostMapping("/getbytripid")
	@ResponseBody
	public ResponseEntity<?> getByTripID(@RequestBody TicketRequest req)
	{
		BaseResponse  rep = service.getByTripID(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
	@PostMapping("/getticket")
	@ResponseBody
	public ResponseEntity<?> getHistory(@RequestBody TicketRequest req)
	{
		BaseResponse  rep = service.getHistoryTicket(req);
		return new ResponseEntity<>(rep,HttpStatus.OK);
	}
	
	@PostMapping("/savechooseseats")
	@ResponseBody
	public ResponseEntity<?> saveChooseSeats(@RequestBody List<Object> req)
	{
		SeatsDisable seatDisable = new SeatsDisable();
		seatDisable.setList(req);
		 MyTask myTask = new MyTask();
		    Timer timer = new Timer();
		    System.out.println("Currnet time: " + new Date());
		    timer.schedule(myTask, 5000);
		return new ResponseEntity<>(seatDisable.getList(),HttpStatus.OK);
	}
	
	@GetMapping("/getchooseseats")
	@ResponseBody
	public ResponseEntity<?> getListChooseSeat() {
		SeatsDisable seatDisable = new SeatsDisable();
		return new ResponseEntity<>(seatDisable.getList(), HttpStatus.OK);

	}
	

}
