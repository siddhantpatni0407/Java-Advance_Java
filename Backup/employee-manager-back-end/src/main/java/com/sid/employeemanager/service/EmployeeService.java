/**
 * 
 */
package com.sid.employeemanager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.employeemanager.exception.UserNotFoundException;
import com.sid.employeemanager.model.Employee;
import com.sid.employeemanager.repo.EmployeeRepo;

/**
 * @author Siddhant
 *
 *         May 8, 2021
 */
@Service
@Transactional
public class EmployeeService {
	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}

	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Employee findEmployeeById(Long id) {
		return employeeRepo.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException("User by Id " + id + " was not found"));
	}

	public void deleteEmployee(Long id) {
		employeeRepo.deleteEmployeeById(id);
	}
}
