package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Country;

public class CountryRunner {

	public static void main(String[] args) {
	Country country = new Country();
	country.getCountry("India");
	country.getCountry("Russia");
	country.getCountry("Italy");
	country.getCountry("Germany");
	country.getCountry("Japan");
	country.readCountry();
	country.update("NEWLAND", "England");
	country.readCountry();
	country.delete("new");
	country.readCountry();
	

	}

}
