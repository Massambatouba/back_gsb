package com.ecolepratique.rapportmedicament.entite;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Offrir {
	@Id
	Long id;
	int quantite;
	@ManyToOne
	Medicament medicament;
	@ManyToOne
	Rapport rapport;
	public Offrir() {};
	public Offrir(Long id, int quantite, Medicament medicament, Rapport rapport) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.medicament = medicament;
		this.rapport = rapport;
	}
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	public Rapport getRapport() {
		return rapport;
	}
	public void setRapport(Rapport rapport) {
		this.rapport = rapport;
	}
	
}
