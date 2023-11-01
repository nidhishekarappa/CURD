package com.xworkz.nidhi.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Sports {
	private String name;
	private int numOfPlayers;
	private int yearOfEstablishment;
	private boolean singles;
	
	public Sports() {
		super();
		
	}

	public Sports(String name, int numOfPlayers, int yearOfEstablishment, boolean singles) {

		this.name = name;
		this.numOfPlayers = numOfPlayers;
		this.yearOfEstablishment = yearOfEstablishment;
		this.singles = singles;
	}
	

}
