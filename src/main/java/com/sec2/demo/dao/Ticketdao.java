package com.sec2.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.sec2.demo.Entitys.ParkingTicket;

public interface Ticketdao extends CrudRepository<ParkingTicket, Integer>{

}
