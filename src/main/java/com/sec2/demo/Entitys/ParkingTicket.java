package com.sec2.demo.Entitys;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
/*
 * entity for all tickets
 */
@Entity
public class ParkingTicket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 //the id for each ticket
	private int id;
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST})
//responsible to know the car
	private ParkedCar pc;
//responsible to know the amount of money to produce
    private int fine;
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE,CascadeType.DETACH})
//responsible to know the the police who writes the ticket
	private PoliceOfficer p;
//responsible to know the  the time that the car has consumed	
	@OneToOne(cascade=CascadeType.ALL)
	private ParkingMeter pm;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ParkedCar getPc() {
		return pc;
	}

	public void setPc(ParkedCar pc) {
		this.pc = pc;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public PoliceOfficer getP() {
		return p;
	}

	public void setP(PoliceOfficer p) {
		this.p = p;
	}

	
}
