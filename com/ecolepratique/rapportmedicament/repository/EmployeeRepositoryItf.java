package com.ecolepratique.rapportmedicament.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.rapportmedicament.entite.Employee;



public interface EmployeeRepositoryItf extends JpaRepository <Employee,Long> {

}
