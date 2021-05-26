package com.ecolepratique.rapportmedicament.entite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rapport {
	@Id
	@GeneratedValue
	private Long id;
	private LocalDate date;
	@Column(columnDefinition = "TEXT") 
	private String bilan;
	private String motif;
	@OneToMany
	 private List<Offrir> offrir;

	public Rapport() {
		offrir = new ArrayList<>();
	}
	public Rapport(LocalDate date, String bilan, String motif) {
		super();
		this.date = date;
		this.bilan = bilan;
		this.motif = motif;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getBilan() {
		return bilan;
	}
	public void setBilan(String bilan) {
		this.bilan = bilan;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public List<Offrir> getOffrir() {
		return offrir;
	}
	public void setOffrir(List<Offrir> offrir) {
		this.offrir = offrir;
	}

}
