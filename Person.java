package com.xworkz.nidhi.things;

public class Person extends Dancer{
	public Person() {
		super("Anil" ,"SFR" ,4, true);
		System.out.println("Name : "+ super.getName());
		System.out.println("Studio name  : "+ super.getStudioName());
		System.out.println("Experience : "+ super.getExperience());
		System.out.println("Is Available  : "+ super.isAvailable());
		System.out.println();
	}

}
