package com.sec2.demo.service;

import java.util.List;

import com.sec2.demo.Entitys.PoliceOfficer;

/*
 * ni ya ba pollice bose 
 */
public interface Polices {
	
	public List<PoliceOfficer> getOfficers();

	public PoliceOfficer getOffice(int id);
}
