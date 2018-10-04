package com.sec2.demo.dao;

import org.springframework.data.repository.CrudRepository;


import com.sec2.demo.Entitys.PoliceOfficer;

public interface Policedao extends CrudRepository<PoliceOfficer, Integer>{

}
