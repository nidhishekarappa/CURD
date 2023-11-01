package com.xworkz.nidhi.things;

public class Movie extends Director{
	public Movie() {
		super("Rakshith" ,"SSE","Rakshith Shetty" , 5);
		System.out.println("Name :  " + super.getName());
		System.out.println("Movie Name  :  " + super.getMname());
		System.out.println("Hero  :  " + super.getHname());
		System.out.println("No.Of films Acted :  " + super.getNumOfFilms());
		System.out.println();
	}

}
