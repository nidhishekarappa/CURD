package com.xworkz.nidhi.things;

public class Indoor extends Sports{
	public Indoor () {
		super("Cricket", 11, 1870, false);
		System.out.println("Name : " +super.getName());
		System.out.println("Number Of players  : " +super.getNumOfPlayers());
		System.out.println("Established in the year  : " +super.getYearOfEstablishment());
		System.out.println("Singles are allowed ?  : " +super.isSingles());
		System.out.println();
	}

}
