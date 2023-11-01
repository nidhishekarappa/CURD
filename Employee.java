package com.xworkz.nidhi.things;

public class Employee extends Company1 {
	public Employee() {
		super("Infosys" , "1980", 450000f,"Software Engineer");
		System.out.println("Name of the Company : "+super.getName());
		System.out.println("Year of Establishment :  " + super.getYearOfEstablishment());
		System.out.println("Expected Lpa : " +super.getSalary());
		System.out.println("Designation : " + super.getDesignation());
		System.out.println();
	}

}
