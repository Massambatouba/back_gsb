package com.ecolepratique.rapportmedicament.service;

import java.util.List;

import com.ecolepratique.rapportmedicament.entite.Offrir;
import com.ecolepratique.rapportmedicament.entite.Rapport;

public interface OffrirServiceItf {

	List<Offrir> list();
	Offrir create(Offrir offrir);
	Offrir getById(Long id);
	Offrir deleteById(Long id);
	Offrir updateById(Long id, Offrir offrir);

}
