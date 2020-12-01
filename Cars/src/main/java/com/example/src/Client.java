package com.example.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	private int id;
	
	private String nume;
	
	public Client() { 
		super();
	}
	
	public Client(int id, String nume) {
		super();
		this.id = id;
		this.nume = nume;
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
	
}
