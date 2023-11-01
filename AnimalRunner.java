package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Dog;

public class AnimalRunner {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setAge(5);
		dog.setColor("Brown");
		dog.setLegNum(4);
		dog.setVeg(false);
		
		int age = dog.getAge();
		System.out.println("Age : " + age);
		
	    String color = dog.getColor();
	    System.out.println("Color : " +color);
	    
	    int legNum = dog.getLegNum();
	    System.out.println("No. of Legs : " +legNum);
	    
	    boolean veg = dog.isVeg();
	    System.out.println("veg : " + veg);
	}

}
