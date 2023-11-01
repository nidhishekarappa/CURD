package com.xworkz.nidhi.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dancer {
	private String name;
	private String studioName;
	private int experience;
	private boolean available;
	
	public Dancer() {
		super();
		
	}

	public Dancer(String name, String studioName, int experience, boolean available) {
		this.name = name;
		this.studioName = studioName;
		this.experience = experience;
		this.available = available;
	}
	

}
