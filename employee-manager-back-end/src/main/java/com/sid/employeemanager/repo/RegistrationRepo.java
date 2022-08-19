/**
 * 
 */
package com.sid.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.employeemanager.model.User;

/**
 * @author Siddhant
 *
 * May 14, 2021
 */
public interface RegistrationRepo extends JpaRepository<User, Integer>{

	/**
	 * @param emailId
	 */
	public User findByEmailId(String emailId);

	/**
	 * @param emailId, password
	 * @return
	 */
	public User findByEmailIdAndPassword(String emailId, String password);

}
