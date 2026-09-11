package com.spacecontrol.exception;
import java.lang.Exception;


public class InvalidMissionStatusException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMissionStatusException(String msg)
	{
		super(msg);
	}
}