package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Indoor;

public class SportsRunner {
	public static void main(String[] args) {
		Indoor indoor = new Indoor();
		indoor.setName("Chess");
		indoor.setNumOfPlayers(2);
		indoor.setYearOfEstablishment(1820);
		indoor.setSingles(true);
		
		String name = indoor.getName();
		int players = indoor.getNumOfPlayers();
		int yoe = indoor.getYearOfEstablishment();
		boolean singles = indoor.isSingles();
		
		System.out.println("Name : " + name);
		System.out.println("Required Number of players   : " + players);
		System.out.println("Established in  : " +yoe );
		System.out.println("Single players are allowed ?  : " + singles);
		
	}

}
