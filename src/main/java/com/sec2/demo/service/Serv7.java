package com.sec2.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec2.demo.Entitys.PoliceOfficer;
import com.sec2.demo.dao.Policedao;
/*
 * this is for policies
 */
@Service
public class Serv7 implements Polices {

	@Autowired
	Policedao pdao;
	
	@Override
	public List<PoliceOfficer> getOfficers() {
		
		return (List<PoliceOfficer>) pdao.findAll();
	}

	@Override
	public PoliceOfficer getOffice(int id) {
		
		return pdao.findById(id).orElse(null);
	}
	/*
	 * for saving only
	 */
	@Transactional
	public void savePolicie(PoliceOfficer po) {
		pdao.save(po);
	}
	public void updatePolicie() {
		
	}

}
