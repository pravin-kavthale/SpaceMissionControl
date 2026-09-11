package com.spacecontrol.exception;
import java.lang.Exception;


public class MissionNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MissionNotFoundException(String msg)
	{
		super(msg);
	}
}