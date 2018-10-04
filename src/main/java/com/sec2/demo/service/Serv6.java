package com.sec2.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec2.demo.Entitys.ParkingTicket;
import com.sec2.demo.dao.Ticketdao;
/*
 * parking tickets  
 */

@Service
public class Serv6 implements Serv2{

	@Autowired
	Ticketdao tdao;
	
	@Override
	@Transactional
	public List<ParkingTicket> getTickets() {
		List<ParkingTicket> lt=(List<ParkingTicket>) tdao.findAll();
		return lt;
	}

	@Override
	@Transactional
	public ParkingTicket getTicket(int id) {
		ParkingTicket pt=tdao.findById(id).orElse(null);
		return pt;
	}

	@Override
	public void updateTicket() {
		// TODO Auto-generated method stub
		
	}

}
