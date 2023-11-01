package com.xworkz.nidhi.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Director {
	private String name;
	private String mname;
	private String hname;
	private int numOfFilms;
	
	public Director() {
		super();
	}

	public Director(String name, String mname, String hname, int numOfFilms) {
		this.name = name;
		this.mname = mname;
		this.hname = hname;
		this.numOfFilms = numOfFilms;
	}
	
	
	
	
	

}
