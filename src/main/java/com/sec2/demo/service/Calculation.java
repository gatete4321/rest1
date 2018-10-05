package com.sec2.demo.service;

import org.springframework.stereotype.Service;
/*
 * this class will use handle all calculation in the project
 */
@Service
public class Calculation
{
	/*
	 * this recurse its self until it reaches to the real price
	 * 
	 */
		public static int calculate(int time) {
			if(time<=60){
				return 2500;
			}
			return 1000+calculate(time);
	}
	
	
}
