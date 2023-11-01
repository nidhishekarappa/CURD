package com.xworkz.nidhi.things;

public class HighLevel extends ProgrammingLang{
	public HighLevel() {
		super("Python " ,"Python IDE" ,true,"3.6.2");
		System.out.println("Name : " +super.getName());
		System.out.println("IDE : " +super.getIdeName());
		System.out.println("Open source : " +super.isOpenSource());
		System.out.println("Version : " +super.getVersion());
		System.out.println();
	}

}
