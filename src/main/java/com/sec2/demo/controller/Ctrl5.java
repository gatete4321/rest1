package com.sec2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sec2.demo.helpers.AllData;
import com.sec2.demo.helpers.AllData2;
import com.sec2.demo.service.Calculation;
/*
 * this is for receiving data from client when he send data first
 */
@RestController
public class Ctrl5 {
//this is for holding the extra time
	private int extratime;
	/*
	 * this is for receiving all necessary data from the client 
	 */
	@PostMapping("/data1")
	public void getFirst(@RequestBody AllData alldata) {
		
	}
	/*
	 * this for receiving the extra time in order to calculate the fine
	 */
	@PostMapping("/extra")
	public void getExtraTime(@RequestBody Integer it) {
		this.extratime=it;
	}
	@GetMapping("/data2")
	public AllData2 sendTheDataOfTheTicket() {
		AllData2 data=new AllData2();
		//i will need to add the purchased time 
		data.setFine(Calculation.calculate(extratime));
		return data;
	}
}
