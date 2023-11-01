package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Ecommerce;

public class ProductsRunner {
	public static void main(String[] args) {
		Ecommerce ecommerce = new Ecommerce();
		ecommerce.setName("Dress");
		ecommerce.setQuantity("1 pair");
		ecommerce.setDelivered(true);
		ecommerce.setRatings(4.2f);
		
		String name = ecommerce.getName();
		String quantity = ecommerce.getQuantity();
		boolean delivered = ecommerce.isDelivered();
		float rating = ecommerce.getRatings();
		
		System.out.println("Name :  " +name);
		System.out.println("Quantity :  " +quantity);
		System.out.println("Delivered :  " +delivered);
		System.out.println("Ratings :  " +rating);

	}
}
