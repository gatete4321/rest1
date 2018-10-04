package com.sec2.demo.exceptions;
/*
 * is for being viewed when the error thrown
 */
public class CarErrorFound {
   


//responsible to know the responsible to know the status for error 
	private int status;
//to print the message 
	private String message;
//the time ellapsed from epoch
	private long timeStamp;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public CarErrorFound(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	public CarErrorFound() {
		super();
	}

}
