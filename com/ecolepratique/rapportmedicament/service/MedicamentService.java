package com.ecolepratique.rapportmedicament.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecolepratique.rapportmedicament.repository.MedicamentRepositoryItf;
import com.ecolepratique.rapportmedicament.entite.Medicament;

@Service
public class MedicamentService implements MedicamentServiceItf {
	@Autowired
	private MedicamentRepositoryItf medicamentDao;
	
	@Override
	public List<Medicament> list() {
		return medicamentDao.findAll();
	}
	@Override
	public Medicament create(Medicament medicament) {
		return medicamentDao.save(medicament);
	}
	@Override
	public Medicament getByNumDepotLegal(Long numDepotLegal) {
		return medicamentDao.findById(numDepotLegal).get();
	}
	@Override
	public Medicament deleteByNumDepotLegal(Long numDepotLegal) {
		Medicament medicament = getByNumDepotLegal(numDepotLegal);
		medicamentDao.deleteById(numDepotLegal);
		return medicament;
	}
	@Override
	public Medicament updateByNumDepotLegal(Long numDepotLegal, Medicament medicament) {
		medicament.setNumDepotLegal(numDepotLegal);
		return medicamentDao.save(medicament);
	}
	
}
