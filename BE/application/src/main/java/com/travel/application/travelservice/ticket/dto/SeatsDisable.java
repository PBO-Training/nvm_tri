package com.travel.application.travelservice.ticket.dto;

import java.util.ArrayList;
import java.util.List;

public class SeatsDisable {
	List<Object> list = new ArrayList<Object>();

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list.add(list);
	}

	public SeatsDisable() {
	}

	public SeatsDisable(List<Object> list) {
		this.list = list;
	}
	
}
