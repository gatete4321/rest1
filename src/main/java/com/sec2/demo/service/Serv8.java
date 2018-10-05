package com.sec2.demo.service;

import org.springframework.stereotype.Service;

import com.sec2.demo.Entitys.ParkedCar;
import com.sec2.demo.Entitys.PoliceOfficer;
import com.sec2.demo.helpers.AllData;
/*
 * for saving data that was been send from client 
 * ukazanalsinga ubndi zikoherezwa
 * izi nizo yohereza bwambere tu 
 * ukagenda uzisavinga
 */ 
@Service
public class Serv8 
{
	
	
//for creating parkedcar
	public ParkedCar saveDataOfParkedCar(AllData alldata) {
		ParkedCar car=new ParkedCar();
		car.setColor(alldata.getColor());
		car.setLisenceNumber(alldata.getLisecenseNumber());
		car.setMake(car.getMake());
		car.setModel(alldata.getModel());
		return car;
		}
	

	public PoliceOfficer saveDataOfPoliceOfficer(AllData alldata) {
		PoliceOfficer po=new PoliceOfficer(); 
		po.setBadgeNumber(alldata.getPolicebagde());
		po.setName(alldata.getPolicename());
		return po;	
	}
	
	
}
