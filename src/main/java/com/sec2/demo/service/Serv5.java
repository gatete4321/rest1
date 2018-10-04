package com.sec2.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec2.demo.Entitys.ParkedCar;
import com.sec2.demo.Entitys.ParkingMeter;
import com.sec2.demo.dao.Carsdao;
/*
 * niyo ma modoka tu ivanze niya parking meter
 */
import com.sec2.demo.dao.Meterdao;

@Service
public class Serv5 implements Serv1{

	@Autowired
	Carsdao cdao;
	@Autowired
	Meterdao mdao;
	
	
	@Override
	@Transactional
	public List<ParkedCar> getCars() {
		List<ParkedCar> p=(List<ParkedCar>) cdao.findAll();
		return p;
	}

	@Override
	@Transactional
	public ParkedCar getCar(int id) {
		ParkedCar pc=cdao.findById(id).orElse(null);
		
		return pc;
	}

	/*
	 * iyi niyo gushaka amasaha amaze ikayohereza kuri servise ya polisi ikamuha fine 
	 * yo kuri yo modoka gusa 
	 */

	@Transactional
	public void saveCar(ParkedCar pc) {
		cdao.save(pc);
	}
	@Transactional
	public void updateCar() {
		
	}
}
