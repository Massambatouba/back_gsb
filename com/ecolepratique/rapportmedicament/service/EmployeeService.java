package com.ecolepratique.rapportmedicament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolepratique.rapportmedicament.entite.Employee;
import com.ecolepratique.rapportmedicament.repository.EmployeeRepositoryItf;


@Service
public class EmployeeService implements EmployeeServiceItf{
	@Autowired
	private EmployeeRepositoryItf employeeRepository;
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> listEmployee(){
		return employeeRepository.findAll();
	}
	@Override
	public Employee findEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
		
	}
	@Override
	public Employee updateEmployeeByid(Long id, Employee employee) {
		employee.setId(id);
		return employeeRepository.save(employee);
		
	}
	@Override
	public Employee deleteEmployeeById(Long id) {
		Employee employee = findEmployeeById(id);
		employeeRepository.deleteById(id);
		return employee;
	}
}
