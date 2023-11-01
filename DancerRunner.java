package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Person;

public class DancerRunner {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Rakesh");
		person.setStudioName("V3");
		person.setExperience(5);
		person.setAvailable(false);
		
		String name = person.getName();
		String Sname = person.getStudioName();
		int experience = person.getExperience();
		boolean available = person.isAvailable();
		
		System.out.println("Name : " +name );
		System.out.println("Studio name : " +Sname );
		System.out.println("Experience : " + experience);
		System.out.println("Available on November?   :  " +available );
	}

}
