package com.xworkz.nidhi.things;

public class Engineering {
	int index = 0;
	String[] branch = new String[5];
	
	public void save(String branchName) {
		if(index< branch.length) {
			branch[index] = branchName;
			index++;
		}else {
			System.out.println("List Is full");
		}
	}
	
	public void read() {
		for(int i = 0; i<branch.length; i++) {
			if(branch[i] != null)
			System.out.println(branch[i]);
		}
	}
	
	public void update(String oldBranch , String newBranch) {
		int update = 0;
		for(int i = 0; i<branch.length; i++) {
			if(branch[i] == oldBranch) {
				branch[i] = newBranch;
				update++;
			}
		}
		if(update !=0) {
			System.out.println("UPDATE DONE SUCESSFULLY");
		}else {
			System.out.println("UPDATION FAILED : Name not found");
			System.out.println("");
		}
	}
	
	public void delete(String branches) {
		System.out.println("DELETION DONE SUCESSFULLY");
		for(int i = 0; i<branch.length; i++) {
			if(branch[i] == branches) {
				branch[i] = null;
			}else {
				if(i== (branch.length - 1)&&(branch[i])!= branches) {
					System.out.println("DELETION UNSUCESSFULL : Name not found");
					System.out.println("");
				}
			}
		}
	}
}
