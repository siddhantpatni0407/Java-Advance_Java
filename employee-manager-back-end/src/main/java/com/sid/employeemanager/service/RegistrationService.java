/**
 * 
 */
package com.sid.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.employeemanager.model.User;
import com.sid.employeemanager.repo.RegistrationRepo;

/**
 * @author Siddhant
 *
 *         May 14, 2021
 */
@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepo registrationRepo;

	public User saveUser(User user) {
		return registrationRepo.save(user);
	}

	public User fetchUserByEmailId(String emailId) {
		return registrationRepo.findByEmailId(emailId);
	}

	public User fetchUserByEmailIdAndPassword(String emailId, String password) {
		return registrationRepo.findByEmailIdAndPassword(emailId, password);
	}
}
