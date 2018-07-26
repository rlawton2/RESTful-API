package com.lawton.ron.messenger.exception;
/*
 * created by rlawton
 * This class is a custom exception that will display a response when a 
 * Runtime exception occurs
 */
public class DataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 419542729639841653L;

	public DataNotFoundException(String message) {
		super(message);
	}
	
}
