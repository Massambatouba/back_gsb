package com.ecolepratique.rapportmedicament.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.rapportmedicament.entite.User;


public interface UserRepositoryItf extends JpaRepository<User, String> {

}
