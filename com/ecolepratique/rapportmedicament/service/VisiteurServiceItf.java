package com.ecolepratique.rapportmedicament.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecolepratique.rapportmedicament.entite.Rapport;
import com.ecolepratique.rapportmedicament.entite.Visiteur;

public interface VisiteurServiceItf {
	Visiteur createVisiteur(Visiteur visiteur);
	Visiteur findVisiteurById(Long id);
	Visiteur updateVisiteurByid(Long id, Visiteur visiteur);
	Visiteur deleteVisiteurById(Long id);
	List<Visiteur> listVisiteur();
	List<Visiteur> listVisiteurEmbaucheByDate(String date, String type);
	
	List<Rapport> listRapportByIdVisiteur(Long idVisiteur);
	Rapport createRapport(Long idVisiteur, Rapport rapport);
}
