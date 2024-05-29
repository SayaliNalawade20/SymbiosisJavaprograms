package com.JPATest.JPAQuestion1.Service;

import java.util.List;
import java.util.Optional;

import com.JPATest.JPAQuestion1.entities.Employee;

public interface EmployeeService {

	public Employee saveData(Employee emp);

	public List<Employee> getAll();

	void deleteEmployee(Long id);
	
	Optional<Employee> getEmployeeById(Long id);

}
