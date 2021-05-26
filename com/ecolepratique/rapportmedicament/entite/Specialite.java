package com.ecolepratique.rapportmedicament.entite;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Specialite {
	@Id
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	private String libelle;

}
