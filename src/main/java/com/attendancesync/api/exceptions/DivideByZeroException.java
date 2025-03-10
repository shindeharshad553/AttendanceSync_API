package com.attendancesync.api.exceptions;

public class DivideByZeroException extends RuntimeException{

	public DivideByZeroException(String msg) {
		super(msg);
	}
}
