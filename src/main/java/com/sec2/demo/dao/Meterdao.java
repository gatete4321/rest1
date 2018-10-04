package com.sec2.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.sec2.demo.Entitys.ParkingMeter;

public interface Meterdao extends CrudRepository<ParkingMeter, Integer> {

}
