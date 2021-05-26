package com.ecolepratique.rapportmedicament.entite;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
@DiscriminatorColumn
public abstract class Employee {
	@Id
	@GeneratedValue
	private Long login;
	private String nom;
	public Long getLogin() {
		return login;
	}
	public void setLogin(Long login) {
		this.login = login;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
