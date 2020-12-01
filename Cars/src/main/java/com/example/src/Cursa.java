package com.example.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cursa {
	@Id
	private int id;
	private int distanta;
	
	
	
	public Cursa(int id, int distanta) {
		super();
		this.id = id;
		this.distanta = distanta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getDistanta() {
		return distanta;
	}
	public void setDistanta(int distanta) {
		this.distanta = distanta;
	}
	
}
