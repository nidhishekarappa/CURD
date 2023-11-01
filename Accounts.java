package com.xworkz.nidhi.things;

public class Accounts extends Bank1{
	
public Accounts() {
	super("HDFC" , "RC road Hassn" ,"IFSC257HDFC8765",false);
	System.out.println("Name : " + super.getName());
	System.out.println("Branch :  " + super.getBranch());
	System.out.println("IFSC :  " +super.getIfscCode());
	System.out.println("Is netbanking available : " + super.isNetbanking());
	System.out.println();
}
}
