package com.example.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Factura {
	@Id
	private int id;
	
	private int nr;
	private String data;
	private String client;
	private int scadenta;
	private int valuare;
	
	
	public int getValuare() {
		return valuare;
	}

	public void setValuare(int valuare) {
		this.valuare = valuare;
	}

	public Factura(int id, int nr, String data, String client, int scadenta, int valuare) {
		super();
		this.id = id;
		this.nr = nr;
		this.data = data;
		this.client = client;
		this.scadenta = scadenta;
		this.valuare = valuare;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public int getScadenta() {
		return scadenta;
	}
	public void setScadenta(int scadenta) {
		this.scadenta = scadenta;
	}
	
}
