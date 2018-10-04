package com.sec2.demo.Entitys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*
 * entity for cars 
 */
@Entity
public class ParkedCar 
{

	@Id
	private int LisenceNumber;
//responsible for collors
	private String color;
	//responsible for model
	private String model;
	//responsible for manifactures
	private String make;
    /*
     * are reference from parkingtickets entity	
     */
	@OneToMany(mappedBy="pc",cascade=CascadeType.ALL)
	private List<ParkingTicket> pt;
	
	
	

	public List<ParkingTicket> getPt() {
		return pt;
	}

	public void setPt(List<ParkingTicket> pt) {
		this.pt = pt;
	}


	public ParkedCar() {
}


	public ParkedCar(int lisenceNumber, String color, String model, String make) {
		super();
		LisenceNumber = lisenceNumber;
		this.color = color;
		this.model = model;
		this.make = make;
	}
	
	
	public int getLisenceNumber() {
		return LisenceNumber;
	}

	public void setLisenceNumber(int lisenceNumber) {
		LisenceNumber = lisenceNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	/*
	 * for adding tickets 
	 */
	public void addTicket(ParkingTicket pat) {
		if(pt==null) {
			pt=new ArrayList<>();
		}
		pt.add(pat);
	}
	

}
