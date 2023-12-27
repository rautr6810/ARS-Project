package com.demojbk.ARS.project;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Air {
	@Id
	private int airid;
	private String airname;
	public Air() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Air(int airid, String airname) {
		super();
		this.airid = airid;
		this.airname = airname;
	}
	public int getAirid() {
		return airid;
	}
	public void setAirid(int airid) {
		this.airid = airid;
	}
	public String getAirname() {
		return airname;
	}
	public void setAirname(String airname) {
		this.airname = airname;
	}
	@Override
	public String toString() {
		return "Air [airid=" + airid + ", airname=" + airname + "]";
	}
}
