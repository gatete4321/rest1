package com.sec2.demo.helpers;
/*
 * is data ni zo bazohereza mbere kugirango umubike:"hari nizindi ziza 
 * nyuma tu aka ni akambere tu" 
 * 
 * umu client niwe uzazohereza tu
 * 
 * it will contain all data to be send to the
 * server in one form only kandi for all entity 
 * it will contain basic data
 */
public class AllData {

//is for lisence number for parked car
	private int LisecenseNumber;
//is for color in parked car	
	private String color;
//is for model in parked car	
	private String Model;
//is for make in parked car	
	private String make;
	
	
//is for purchased time in parking meter	
	private  long purchasedtime;
	
	
//to send pollice officer name in order to see if it valid
	private String Policename;
//	to send pollice officer name in order to see if it valid
	private int Policebagde;
	public int getLisecenseNumber() {
		return LisecenseNumber;
	}
	public void setLisecenseNumber(int lisecenseNumber) {
		LisecenseNumber = lisecenseNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public long getPurchasedtime() {
		return purchasedtime;
	}
	public void setPurchasedtime(long purchasedtime) {
		this.purchasedtime = purchasedtime;
	}
	public String getPolicename() {
		return Policename;
	}
	public void setPolicename(String policename) {
		Policename = policename;
	}
	public int getPolicebagde() {
		return Policebagde;
	}
	public void setPolicebagde(int policebagde) {
		Policebagde = policebagde;
	}
	
	
	
	
	
}
