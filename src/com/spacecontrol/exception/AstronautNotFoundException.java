package com.spacecontrol.exception;
import java.lang.Exception;


public class AstronautNotFoundException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AstronautNotFoundException(String msg)
	{
		super(msg);
	}
	
}