/**
 * 
 */
package com.sid.employeemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.employeemanager.model.User;
import com.sid.employeemanager.service.RegistrationService;

/**
 * @author Siddhant
 *
 *         May 14, 2021
 */
@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;

	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			User userObj = registrationService.fetchUserByEmailId(tempEmailId);
			if (userObj != null) {
				throw new Exception("User with  " + tempEmailId + " is already exists");
			}
		}
		User userObj = null;
		userObj = registrationService.saveUser(user);
		return userObj;
	}

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPassword = user.getPassword();
		User userObj = null;
		if (tempEmailId != null && tempPassword != null) {
			userObj = registrationService.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		if (userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}

}
