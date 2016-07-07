package com.bridgelabz.controllers;

public class SpringException extends RuntimeException{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionMsg;
	   
	   public SpringException(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }
	   
	   public String getExceptionMsg(){
	      return this.exceptionMsg;
	   }
	   
	   public void setExceptionMsg(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }
	}