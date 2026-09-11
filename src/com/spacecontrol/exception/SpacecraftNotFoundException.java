package com.spacecontrol.exception;
import java.lang.Exception;


public class SpacecraftNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SpacecraftNotFoundException(String msg)
	{
		super(msg);
	}
}