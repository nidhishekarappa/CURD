package com.xworkz.nidhi.things;

public class Country {
     int index = 0;
     String[] country = new String[5];
     
     public void getCountry(String countryName) {
    		 if(index<country.length) {
    			 country[index]= countryName;
    			 index++;
    		 }else {
    			 System.out.println("List is full");
    		 }
    	 
    	 
     }
     
     
     public void readCountry() {
    	
    	 for(int i =0; i< country.length; i++) {
    		 
    		 if(country[i] != null) {
    			 System.out.println("Country Names " + country[i]);
    			
    		 }
    	 }
    	 System.out.println("");
     }
     
     public void update(String oldCountry , String newCountry) {
    	 boolean found = false;
    	 for(int i = 0;i<country.length; i++) {
    		 if(country[i ]==oldCountry) {
    			 country[i] = newCountry;
    			 found = true;
    		 }
    	 }
    	 if(!found) {
    		 System.out.println( " Name Not Found");
    		 System.out.println("");
    	 }else {
    		 System.out.println("UPDATED SUCCESSFULLY");
    		 
    	 }
    	 
     }
     
     public void delete(String deleteCountry) {
    	 System.out.println("DELETED SUCCESSFULLY");
    	 for(int i =0; i<country.length; i++) {
    		 if(country[i] == deleteCountry) {
    			 country[i] = null;	 
    		 }else {
    			 if(i ==(country.length-1)&&(country[i])!= deleteCountry) {
    				 System.out.println("DELETION UNSUCESSFULL : Country Not found ");
    				 System.out.println("");
    			 }
    		 }
    		 
    	 }
     }

}
