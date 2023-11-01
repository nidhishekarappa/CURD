package com.xworkz.nidhi.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Products {
private String name;
private String quantity;
private boolean delivered;
private float ratings;

public Products(){
	super();
}

public Products(String name, String quantity, boolean delivered, float ratings) {

	this.name = name;
	this.quantity = quantity;
	this.delivered = delivered;
	this.ratings = ratings;
}

}
