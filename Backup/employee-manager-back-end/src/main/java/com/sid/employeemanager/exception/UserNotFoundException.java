/**
 * 
 */
package com.sid.employeemanager.exception;

/**
 * @author Siddhant
 *
 *         May 8, 2021
 */
public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String message) {
		super(message);
	}
}