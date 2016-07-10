package com.luxoft.tc.junit;

public class ValidationResult {
	public static final byte ERROR = 0x1;
	public static final byte WARNING = 0x2;
	
	private byte code;
	private String message;
	
	public ValidationResult(byte code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public byte getCode() {
		return this.code;
	}
	
	public String getMessage() {
		return this.message;
	}
}