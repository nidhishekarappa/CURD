package com.xworkz.nidhi.things;

public class Ipl {
	int index = 0;
	String[] ipl = new String[5];
	
	public void save(String iplNames) {
		if(index < ipl.length) {
			ipl[index] = iplNames;
			index++;
		}else {
			System.out.println("LIST IS FULL");
		}	
	}
	
	public void read() {
		for(int i =0; i<ipl.length; i++) {
			if(ipl[i] != null) {
				System.out.println(ipl[i]);
			}
		}
	}
	
	public void update(String oldName, String newName) {
		int update = 0;
		for(int i = 0; i<ipl.length; i++) {
			if(ipl[i] == oldName ) {
				ipl[i] = newName;
				update++;
			}
	  }
		if(update!= 0) {
			System.out.println("UPDATION SUCESSFULL");
		}else {
			System.out.println("UPDATION UNSUCESSFULL");
		}
	}
	
	public void delete(String delete) {
		for(int i = 0; i<ipl.length; i++) {
			if(ipl[i] == delete) {
				ipl[i] = null;
			}else {
				if(i == (ipl.length -1 )&& (ipl[i]) != delete) {
					System.out.println("DELETION UNSUCESSFULL");
				}
			}
		}
	}
}
