package com.sec2.demo.Entitys;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ParkingMeter
{

	@Id
	private int id;
	@OneToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	private ParkingTicket pt;
	/*
	 * irabika igihe yaguze tu
	 */
	private long purchasedtime;
	/*
	 * irabika igihe cyarenze kucyo yaguzwe
	 * by default ni zeru
	 */
	private long  extraTime;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ParkingTicket getPt() {
		return pt;
	}
	public void setPt(ParkingTicket pt) {
		this.pt = pt;
	}
	public long getPurchasedtime() {
		return purchasedtime;
	}
	public void setPurchasedtime(long purchasedtime) {
		this.purchasedtime = purchasedtime;
	}
	public long getExtraTime() {
		return extraTime;
	}
	public void setExtraTime(long extraTime) {
		this.extraTime = extraTime;
	}
	

	
	
}
