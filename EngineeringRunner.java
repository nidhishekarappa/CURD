package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Engineering;

public class EngineeringRunner {

	public static void main(String[] args) {
		Engineering engineer = new Engineering();
		engineer.save("CSE");
		engineer.save("ISE");
		engineer.save("ME");
		engineer.save("ECE");
		engineer.save("EEE");
		engineer.read();
		System.out.println("");
		engineer.update("EEE", "IP");
		
		engineer.read();
		System.out.println("");
		engineer.delete("IP");
		engineer.read();

	}

}
