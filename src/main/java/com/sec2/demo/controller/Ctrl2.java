package com.sec2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec2.demo.Entitys.ParkingTicket;
import com.sec2.demo.exceptions.CarNotFoundException;
import com.sec2.demo.service.Serv6;
/*
 * contrroller for parking ticket
 */
@RestController
public class Ctrl2
{
	@Autowired
	Serv6 serv6;

	/*
	 *get all tickets 
	 */
	@RequestMapping("/tickets")
	public List<ParkingTicket> getTickets(){
		List<ParkingTicket> lpt=serv6.getTickets();
		return lpt;
	}
	@RequestMapping("/tickets/{id}")
	public ParkingTicket getTicket(@PathVariable int id) {
		ParkingTicket pt=serv6.getTicket(id);
		if(pt==null) {
			throw new CarNotFoundException("the ticket not found "+id);
			
		}
		return pt;
	}
	
	/*
	 * 50% bayarangiye tu
	 */
}
