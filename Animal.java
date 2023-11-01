package com.xworkz.nidhi.things;


import lombok.Getter;

import lombok.Setter;

@Getter
@Setter


public class Animal {
	private int age;
	private int legNum;
	private String color;
	private boolean veg;
	
	public Animal() {
		super();
	}

	public Animal(int age, int legNum, String color, boolean veg) {
		super();
		this.age = age;
		this.legNum = legNum;
		this.color = color;
		this.veg = veg;
	}
	
	

}
