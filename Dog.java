package com.xworkz.nidhi.things;

public class Dog extends Animal {
	public Dog() {
		super(5, 4,"Brown" , false);
		System.out.println("Constructor Chaining ");
		System.out.println("Age : "+super.getAge());
		System.out.println("Color : "+super.getColor());
		System.out.println("No.of Legs : "+super.getLegNum());
		System.out.println("Veg : "+super.isVeg());
		System.out.println("End of Constructor Chaining");
		System.out.println();
	}

}