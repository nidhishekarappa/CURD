package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Movie;

public class DirectorRunner {

	public static void main(String[] args) {
	Movie movie = new Movie();
	movie.setName("Rishab");
	movie.setMname("Kantara");
	movie.setHname("Rishab Shetty");
	movie.setNumOfFilms(4);
	
	String name = movie.getName();
	String mname = movie.getMname();
	String hname = movie.getHname();
	int film = movie.getNumOfFilms();
	System.out.println("Name : "+ name);
	System.out.println("Movie name : "+ mname);
	System.out.println("Hero : "+ hname);
	System.out.println("No.Of Films Acted  : "+ film);

	}

}
