package com.ecolepratique.rapportmedicament.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.rapportmedicament.entite.Rapport;
import com.ecolepratique.rapportmedicament.entite.Visiteur;

public interface VisiteurRepositoryItf extends JpaRepository<Visiteur, Long> {
	List<Visiteur> findByDateEmbaucheAfter(LocalDate date);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
