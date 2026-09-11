package com.spacecontrol.exception;
import java.lang.Exception;


public class CrewLimitException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CrewLimitException(String msg)
	{
		super(msg);
	}
}