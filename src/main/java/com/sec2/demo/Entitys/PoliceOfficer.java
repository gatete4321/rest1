package com.sec2.demo.Entitys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/*
 * entity for pollic men
 */
@Entity
public class PoliceOfficer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//generate the id for that police	
	private int id;
//his names
	private String name;
//his badges	
	private int badgeNumber;

	@OneToMany(mappedBy="p",cascade= {CascadeType.PERSIST,CascadeType.REFRESH})
	private List<ParkingTicket> pac;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
   	this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	public void add(ParkingTicket pt) {
		if(pac==null) {
			pac=new ArrayList<>();
		}
		pac.add(pt);
	}
}
