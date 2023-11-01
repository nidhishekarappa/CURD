package com.xworkz.nidhi.things;

public class Ecommerce extends Products{
	public Ecommerce() {
		super("Bottle" , "1", true,3.8f);
		System.out.println("Name  : " +super.getName());
		System.out.println("Quantity :  " +super.getQuantity());
		System.out.println("Is Delivered :  " +super.isDelivered());
		System.out.println("Ratings :  " +super.getRatings());
		System.out.println();
	}

}
