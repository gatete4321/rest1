package com.sec2.demo.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sec2.demo.service.Serv5;
import com.sec2.demo.service.Serv7;

@Controller
public class FakeController 
{
	@Autowired
	Serv5 serv;
	@Autowired
	Serv7 serv7;

	
	Hano hano=new Hano();
	
	@RequestMapping("/")
	@ResponseBody
	public String save() {
		serv.saveCar(hano.createCar());
		serv7.savePolicie(hano.createPollice());
		
		return "gateterwe";
	}
}
