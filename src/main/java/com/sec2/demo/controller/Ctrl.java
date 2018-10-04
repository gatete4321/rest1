package com.sec2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec2.demo.Entitys.ParkedCar;
import com.sec2.demo.exceptions.CarNotFoundException;
import com.sec2.demo.service.Serv5;

/*
 * cotroller for all parked car
 */
@RestController
public class Ctrl {
	@Autowired
	Serv5 serv5;
	
	
	
	
	@RequestMapping("cars")
	public List<ParkedCar> getCars(){
		return serv5.getCars();
	}
	@RequestMapping("/cars/{LisenceNumber}")
	public ParkedCar getCar(@PathVariable int LisenceNumber) {
	ParkedCar pc=serv5.getCar(LisenceNumber);

		if(pc==null) {
			throw new CarNotFoundException("the car not found "+LisenceNumber);
			
		}
		
		return pc;
	}
	/*
	 * all parked car for today 
	 */
	public List<ParkedCar> getcar(){
		return null;
	}


}
