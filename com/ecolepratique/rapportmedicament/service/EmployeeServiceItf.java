package com.ecolepratique.rapportmedicament.service;

import java.util.List;

import com.ecolepratique.rapportmedicament.entite.Employee;

public interface EmployeeServiceItf {

	Employee createEmployee(Employee employee);

	List<Employee> listEmployee();

	Employee findEmployeeById(Long id);

	Employee updateEmployeeByid(Long id, Employee employee);

	Employee deleteEmployeeById(Long id);

}
