package com.sec2.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * for handleling errors 
 */

@ControllerAdvice
public class CarExceptionHandler
{
/*
 * error handling for car not found
 */
	@ExceptionHandler
	public ResponseEntity<CarErrorFound> handlingExcepion(CarNotFoundException ex){
		
		CarErrorFound erro=new CarErrorFound(HttpStatus.BAD_REQUEST.value(),
				                              ex.getMessage(),
				                              System.currentTimeMillis());
		
		
		return new ResponseEntity<>(erro,HttpStatus.BAD_REQUEST);																			
		}
	/*
	 *  * error handling for car not found
	 */
	@ExceptionHandler
	public ResponseEntity<CarErrorFound> handlingAllExcepion(Exception ex){
		
		CarErrorFound erro=new CarErrorFound(HttpStatus.NOT_FOUND.value(),
				                              ex.getMessage(),
				                              System.currentTimeMillis());
		
		
		return new ResponseEntity<>(erro,HttpStatus.NOT_FOUND);	
	}
}
