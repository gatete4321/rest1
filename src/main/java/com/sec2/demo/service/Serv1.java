package com.sec2.demo.service;

import java.util.List;

import com.sec2.demo.Entitys.ParkedCar;

/*
 * for parked car
 */
public interface Serv1 {

	public List<ParkedCar> getCars();
	public ParkedCar getCar(int id);
}
