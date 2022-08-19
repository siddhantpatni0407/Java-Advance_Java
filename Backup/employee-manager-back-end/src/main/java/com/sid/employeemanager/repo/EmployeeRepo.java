/**
 * 
 */
package com.sid.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.employeemanager.model.Employee;

/**
 * @author Siddhant
 *
 *         May 8, 2021
 */
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	/**
	 * @param id
	 */
	void deleteEmployeeById(Long id);

	/**
	 * @param id
	 * @return
	 */
	Optional<Employee> findEmployeeById(Long id);

}
