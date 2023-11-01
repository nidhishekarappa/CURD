package com.xworkz.nidhi.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank1 {
	private String name;
	private String branch;
	private String ifscCode;
	private boolean netbanking;
	
	public Bank1() {
		super();
	}

	public Bank1(String name, String branch, String ifscCode, boolean netbanking) {
		this.name = name;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.netbanking = netbanking;
	}
	
	

}
