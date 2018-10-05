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

/*
 * iyi niya ma parking car tu 
 * nicyo ishinzwe 
 * hamwe nokongeramo amatike tu
 */

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



	@Transactional
	public void saveCar(ParkedCar pc) {
		if(cdao.existsById(pc.getLisenceNumber())) {
		update(pc);
		}
		else {
			cdao.save(pc);
		}
	}
	public void update(ParkedCar pc) {
		ParkedCar car=cdao.findById(pc.getLisenceNumber()).orElse(null);
	}

}
