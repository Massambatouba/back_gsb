package com.ecolepratique.rapportmedicament.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolepratique.rapportmedicament.entite.Rapport;
import com.ecolepratique.rapportmedicament.entite.Visiteur;
import com.ecolepratique.rapportmedicament.repository.RapportRepositoryItf;
import com.ecolepratique.rapportmedicament.repository.VisiteurRepositoryItf;

@Service
public class VisiteurService implements VisiteurServiceItf {
	@Autowired
	private VisiteurRepositoryItf visiteurRepository;
	@Autowired
	private RapportRepositoryItf rapportRepository;
	
	@Override
	public Visiteur createVisiteur(Visiteur visiteur) {
		return visiteurRepository.save(visiteur);
	}
	@Override
	public List<Visiteur> listVisiteur() {
		return visiteurRepository.findAll();
	}
	@Override
	public Visiteur findVisiteurById(Long id) {
		//return visiteurRepository.findById(id);
		return visiteurRepository.findById(id).get();
	}
	@Override
	public Visiteur updateVisiteurByid(Long id, Visiteur visiteur) {
		visiteur.setId(id);
		return visiteurRepository.save(visiteur);
	}
	@Override
	public Visiteur deleteVisiteurById(Long id) {
		Visiteur visiteur = findVisiteurById(id); 
		visiteurRepository.deleteById(id);
		return visiteur;
	}
	@Override
	public Rapport createRapport(Long idVisiteur, Rapport rapport) {
		rapport = rapportRepository.save(rapport);
		Visiteur visiteur = findVisiteurById(idVisiteur);
		//visiteur.getRapports();
		visiteur.addRapport(rapport);
		//System.out.println("VisiteurService - createRapport visiteur=" + visiteur);
		visiteurRepository.save(visiteur);
		//System.out.println("VisiteurService - createRapport visiteur=" + visiteur);
		return rapport;
	}
	@Override
	public List<Rapport> listRapportByIdVisiteur(Long idVisiteur) {
		return findVisiteurById(idVisiteur).getRapports();
	}
	/*
	@Override
	public List<Visiteur> listVisiteurEmbaucheByDate(String date, String type) {
		String[] tab = date.split("-"); 
		List<Visiteur> visiteurs = null;
		if(type.equals("after"))
			visiteurs = visiteurRepository.findByDateEmbaucheAfter(LocalDate.of(Integer.valueOf(tab[0]), Integer.valueOf(tab[1]), Integer.valueOf(tab[2])));
		else if(type.equals("before"))
			visiteurs = visiteurRepository.findByDateEmbaucheBefore(LocalDate.of(Integer.valueOf(tab[0]), Integer.valueOf(tab[1]), Integer.valueOf(tab[2])));
		return visiteurs; 
	} */
	@Override
	public List<Visiteur> listVisiteurEmbaucheByDate(String date, String type) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
