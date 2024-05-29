package com.JPATest.JPAQuestion1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPATest.JPAQuestion1.Repo.EmployeeRepository;
import com.JPATest.JPAQuestion1.entities.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee saveData(Employee emp) {
		return employeeRepository.save(emp);
	}
	@Override
	public List<Employee> getAll() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public void deleteEmployee(Long id) {
		 employeeRepository.deleteById(id);

		
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);

	}

	

	
}
