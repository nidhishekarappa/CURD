package com.xworkz.nidhi.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProgrammingLang {
private String name;
private String ideName;
private boolean openSource;
private String version;

public ProgrammingLang() {
	super();
	
}

public ProgrammingLang(String name, String ideName, boolean openSource, String version) {
	this.name = name;
	this.ideName = ideName;
	this.openSource = openSource;
	this.version = version;
}


}
