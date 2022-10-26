package main;

import java.time.LocalDateTime;

//This is a checked exception as it extends from Exception
public class DivideByZeroException extends Exception{

	private LocalDateTime timeOfException;

	public DivideByZeroException(LocalDateTime timeOfException) {
		super("Second number cannot be zero!");
		this.timeOfException = timeOfException;
	}
	
	public LocalDateTime getTimeOfException() {
		return timeOfException;
	}
	
	
	
	
}
