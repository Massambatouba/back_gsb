package com.ecolepratique.rapportmedicament.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolepratique.rapportmedicament.entite.Rapport;
import com.ecolepratique.rapportmedicament.repository.RapportRepositoryItf;

@Service
public class RapportService implements RapportServiceItf {
	@Autowired
	private RapportRepositoryItf rapportRepository;
	
	@Override
	public Rapport findRapportById(Long id) {
		//return rapportRepository.findById(id);
		return rapportRepository.findById(id).get();
	}
	@Override
	public List<Rapport> listRapport() {
		return rapportRepository.findAll();
	}
	@Override
	public Rapport updateRapport(Long id, Rapport rapport) {
		rapport.setId(id);
		return rapportRepository.save(rapport);
	}
	@Override
	public Rapport deleteById(Long id) {
		Rapport rapport = findRapportById(id);
		rapportRepository.deleteById(id);
		return rapport;
	}
	@Override
	public List<Rapport> listRapportByChampEtMotCle(String champ, String motCle){
		List<Rapport> rapports = null;
		if(champ.equals("motif")){
			rapports = rapportRepository.findByMotifLike("%" + motCle + "%");
		}
		else if(champ.equals("bilan")) {
			rapports = rapportRepository.findByBilanLike("%" + motCle + "%");
		}
		return rapports;
	}
	public List<Rapport> listRapportByDate(String date, String type){
		String[] tab = date.split("-"); 
		List<Rapport> rapports = null;
		if(type.equals("after"))
			rapports = rapportRepository.findByDateAfter(LocalDate.of(Integer.valueOf(tab[0]), Integer.valueOf(tab[1]), Integer.valueOf(tab[2])));
		else if(type.equals("before"))
			rapports = rapportRepository.findByDateBefore(LocalDate.of(Integer.valueOf(tab[0]), Integer.valueOf(tab[1]), Integer.valueOf(tab[2])));
		return rapports;
	}
}