package com.cdac.exceptions;

public class InvalidDateException extends RuntimeException {

	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message);
	}
}

