package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Accounts;

public class Bank1Runner {
	public static void main(String[] args) {
		Accounts account = new Accounts();
		account.setName("Canara Bank");
		account.setBranch("MCE branch");
		account.setIfscCode("IFSC254CAN14");
		account.setNetbanking(true);
		
		String name = account.getName();
		String branch = account.getBranch();
		String ifsc = account.getIfscCode();
		boolean netbanking = account.isNetbanking();
		
		System.out.println("Name :  "+ name);
		System.out.println("Branch :  "+ branch);
		System.out.println("IFSC code :  "+ ifsc);
		System.out.println("Is Netbanking Available  :  "+ netbanking);
	}

}
