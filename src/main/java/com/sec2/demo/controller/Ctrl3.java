package com.sec2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec2.demo.Entitys.PoliceOfficer;
import com.sec2.demo.exceptions.CarNotFoundException;
import com.sec2.demo.service.Serv7;

/*
 * controller for pollice officers
 */
@RestController
public class Ctrl3 {
	@Autowired
	Serv7 s;
	
	@RequestMapping("/officers")
	public List<PoliceOfficer> getOfficers(){
		
		return s.getOfficers();
	}
	@RequestMapping("/officer/{id}")
	public PoliceOfficer getOfficer(@PathVariable int id)
	{
		PoliceOfficer po=s.getOffice(id);
		if(po==null) {
			throw new CarNotFoundException("the pollice Officer not found "+id);
		}
		
		return po;
	}
	@PostMapping("/officer/add")
	public PoliceOfficer addOfficer(@RequestBody PoliceOfficer po) {

		PoliceOfficer officer=new PoliceOfficer();
		officer.setBadgeNumber(po.getBadgeNumber());
		officer.setName(po.getName());
		s.savePolicie(officer);
		return null;
	}
}
