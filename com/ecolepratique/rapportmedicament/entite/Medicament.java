package com.ecolepratique.rapportmedicament.entite;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;





@Entity
public class Medicament {
	@Id
	private Long numDepotLegal;
	private String nomCommercial;
	@ElementCollection
	private List<String> effets;
	@ElementCollection
	private List<String> contreIndications;
	
	@OneToMany
	private List<Offrir> offrir;
	public List<Offrir> getOffrir() {
		return offrir;
	}
	
	public Medicament(Long numDepotLegal, String nomCommercial, List<String> effets, List<String> contreIndications) {
		super();
		this.numDepotLegal = numDepotLegal;
		this.nomCommercial = nomCommercial;
		this.effets = effets;
		this.contreIndications = contreIndications;
	}
	
	
	public Medicament() {
		effets = new ArrayList<>();
		contreIndications = new ArrayList<>();
	}
	public Medicament(Long numDepotLegal, String nomCommercial) {
		this();
		this.numDepotLegal = numDepotLegal;
		this.nomCommercial = nomCommercial;
	}
	
	
	@Override
	public String toString() {
		return "Medicament [numDepotLegal=" + numDepotLegal + ", nomCommercial=" + nomCommercial + ", effets=" + effets
				+ ", contreIndications=" + contreIndications + "]\n\n";
	}
	public void addEffet(String effet) {
		effets.add(effet);
	}
	
	
	public void addContreIndication(String contreIndication) {
		contreIndications.add(contreIndication);
	}
	public Long getNumDepotLegal() {
		return numDepotLegal;
	}
	public void setNumDepotLegal(Long numDepotLegal) {
		this.numDepotLegal = numDepotLegal;
	}
	public String getNomCommercial() {
		return nomCommercial;
	}
	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}
	public List<String> getEffets() {
		return effets;
	}
	public void setEffets(List<String> effets) {
		this.effets = effets;
	}
	public List<String> getContreIndications() {
		return contreIndications;
	}
	public void setContreIndications(List<String> contreIndications) {
		this.contreIndications = contreIndications;
	}	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
