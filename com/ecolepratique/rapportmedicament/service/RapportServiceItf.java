package com.ecolepratique.rapportmedicament.service;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecolepratique.rapportmedicament.entite.Rapport;
import com.ecolepratique.rapportmedicament.entite.Visiteur;

public interface RapportServiceItf {
	List<Rapport> listRapport();
	Rapport findRapportById(Long id);
	Rapport updateRapport(Long id, Rapport rapport);
	Rapport deleteById(Long id);
	List<Rapport> listRapportByChampEtMotCle(String champ, String motCle);
	List<Rapport> listRapportByDate(String date, String type);
}
