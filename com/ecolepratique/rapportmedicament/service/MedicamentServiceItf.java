package com.ecolepratique.rapportmedicament.service;

import java.util.List;
import com.ecolepratique.rapportmedicament.entite.Medicament;

public interface MedicamentServiceItf {
	Medicament create(Medicament medicament);
	List<Medicament> list();
	Medicament getByNumDepotLegal(Long numDepotLegal);
	Medicament deleteByNumDepotLegal(Long numDepotLegal);
	Medicament updateByNumDepotLegal(Long numDepotLegal, Medicament medicament);
}
