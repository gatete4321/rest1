package com.sec2.demo.helpers;
/*
 * is to send the final data the full ticket
 */
public class AllData2 
{
//the ticket id
	private int id;
//contain the lisence number of that car
    private int lisenceNumber;
//contain the name of police
    private String name;
//contain the bagde of police
    private String bagde;
//contain the fine that should be payed
//it will be calculated using the input that was received   
    private int fine;
    
    
    
	public AllData2(int id, int lisenceNumber, String name, String bagde, int fine) {
	super();
	this.id = id;
	this.lisenceNumber = lisenceNumber;
	this.name = name;
	this.bagde = bagde;
	this.fine = fine;
}
	public AllData2() {
	super();
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLisenceNumber() {
		return lisenceNumber;
	}
	public void setLisenceNumber(int lisenceNumber) {
		this.lisenceNumber = lisenceNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBagde() {
		return bagde;
	}
	public void setBagde(String bagde) {
		this.bagde = bagde;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
    
}
