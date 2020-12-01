package com.example.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Masina {
	@Id
	private int id;
	
	private String nrInm;
	private int km;
	private String dataRCA;
	private String dataITP;
	
	
	public Masina() {
		super();
	}
	public Masina(int id, String nrInm, int km, String dataRCA, String dataITP) {
		super();
		this.id = id;
		this.nrInm = nrInm;
		this.km = km;
		this.dataRCA = dataRCA;
		this.dataITP = dataITP;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNrInm() {
		return nrInm;
	}
	public void setNrInm(String nrInm) {
		this.nrInm = nrInm;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getDataRCA() {
		return dataRCA;
	}
	public void setDataRCA(String dataRCA) {
		this.dataRCA = dataRCA;
	}
	public String getDataITP() {
		return dataITP;
	}
	public void setDataITP(String dataITP) {
		this.dataITP = dataITP;
	}
}
