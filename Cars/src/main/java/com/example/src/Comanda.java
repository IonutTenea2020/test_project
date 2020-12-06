package com.example.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comanda {
	@Id
	private int id;
	
	private int nr;
	private String data;
	
	
	public Comanda() {
		super();
	}

	public Comanda(int id, int nr, String data) {
		super();
		this.id = id;
		this.nr = nr;
		this.data = data;

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

	
}
