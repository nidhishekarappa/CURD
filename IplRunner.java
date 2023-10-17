package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Ipl;

public class IplRunner {

	public static void main(String[] args) {
		Ipl ipl = new Ipl();
		ipl.save("RCB");
		ipl.save("CSK");
		ipl.save("MI");
		ipl.save("LSG");
		ipl.save("PSK");
		ipl.read();
		System.out.println("");
		ipl.update("PSK", "GT");
		ipl.read();
		System.out.println("");
		ipl.delete("MI");
		ipl.read();
		

	}

}
