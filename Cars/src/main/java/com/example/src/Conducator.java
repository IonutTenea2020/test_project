package com.example.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conducator {
	@Id
	private int id;
	
	private String nume;
	private String prenume;
	private String dataAng;
	
	
	
	
	public Conducator(int id, String nume, String prenume, String dataAng) {
		super();
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.dataAng = dataAng;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getDataAng() {
		return dataAng;
	}
	public void setDataAng(String dataAng) {
		this.dataAng = dataAng;
	}
	
}
