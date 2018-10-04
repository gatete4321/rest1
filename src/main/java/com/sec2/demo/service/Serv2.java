package com.sec2.demo.service;

import java.util.List;

import com.sec2.demo.Entitys.ParkingTicket;

/*
 * for tickets only
 */
public interface Serv2 {
	
public List<ParkingTicket> getTickets();
public ParkingTicket getTicket(int id);
public void updateTicket();
}
