package com.ecolepratique.rapportmedicament.entite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Visiteur extends Employee {
	
	private Long id;
	private String nom;
	private LocalDate dateEmbauche;
	@OneToMany
	private List<Rapport> rapports;
	public Visiteur() {
		rapports = new ArrayList<>();
	}
	public Visiteur(String nom, LocalDate dateEmbauche) {
		super();
		this.nom = nom;
		
		this.dateEmbauche = dateEmbauche;
		rapports = new ArrayList<>();
	}
	public void addRapport(Rapport rapport) {
		rapports.add(rapport);
	}
	
	@Override
	public String toString() {
		return "\nVisiteur [id=" + id + ", nom=" + nom + ", dateEmbauche=" + dateEmbauche + ", rapports=" + rapports
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public List<Rapport> getRapports() {
		return rapports;
	}
	public void setRapports(List<Rapport> rapports) {
		this.rapports = rapports;
	}
}
