package com.xworkz.nidhi.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Company1 {
	private String name;
	private String yearOfEstablishment;
	private float salary;
	private String designation;
	
	public Company1() {
		super();
	}

	public Company1(String name, String yearOfEstablishment, float salary, String designation) {
		this.name = name;
		this.yearOfEstablishment = yearOfEstablishment;
		this.salary = salary;
		this.designation = designation;
	}
	
	

}
