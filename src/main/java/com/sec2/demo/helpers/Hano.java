package com.sec2.demo.helpers;

import com.sec2.demo.Entitys.ParkedCar;
import com.sec2.demo.Entitys.ParkingTicket;
import com.sec2.demo.Entitys.PoliceOfficer;
/*
 * niyo gu testinga utazirirw ushiramo ibirenze
 */

public class Hano
{

	public ParkedCar createCar() {
		ParkedCar pc=new ParkedCar();
		pc.setColor("umweru");
		pc.setLisenceNumber(586);
		pc.setModel("ToyotA");
		pc.setMake("japan");
		return pc;
	}
	
	public PoliceOfficer createPollice()
	{
		PoliceOfficer pf=new PoliceOfficer();
		pf.setBadgeNumber(1317);
		pf.setName(" gatete rutamu");
		
		return pf;
	}
	public ParkingTicket creteTicket() {
	
		ParkingTicket pt=new ParkingTicket();
		pt.setFine(2500);
	
		return pt;
	}
}
