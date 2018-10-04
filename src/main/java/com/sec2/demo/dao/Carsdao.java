package com.sec2.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sec2.demo.Entitys.ParkedCar;
import com.sec2.demo.Entitys.ParkingMeter;
import com.sec2.demo.Entitys.ParkingTicket;

public interface Carsdao extends CrudRepository<ParkedCar, Integer> {
	//List<ParkingMeter> findByPm();
	//List<ParkingTicket> findByPt();
}
