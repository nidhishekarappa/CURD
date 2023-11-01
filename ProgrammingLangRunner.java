package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.HighLevel;

public class ProgrammingLangRunner {
	public static void main(String[] args) {
		HighLevel  highLevel = new HighLevel();
		highLevel.setName("JAVA");
		highLevel.setIdeName("eclipse");
		highLevel.setOpenSource(true);
		highLevel.setVersion("8.1.1");
		
		String name = highLevel.getName();
		String ide = highLevel.getIdeName();
		boolean openSource = highLevel.isOpenSource();
		String ver = highLevel.getVersion();
		
		System.out.println("Name : " + name);
		System.out.println("IDE : " + ide);
		System.out.println("Open source  : " + openSource);
		System.out.println("Version : " + ver);
	}

}
