package com.xworkz.nidhi.driver;

import com.xworkz.nidhi.things.Employee;

public class Company1Runner {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Wipro");
		employee.setYearOfEstablishment("1995");
		employee.setSalary(400000f);
		employee.setDesignation("Software Developer");

		String nameOfCompany = employee.getName();
		System.out.println("Name of the company : " + nameOfCompany);

		String year = employee.getYearOfEstablishment();
		System.out.println("Year Of Establishment : " + year);

		float salary = employee.getSalary();
		System.out.println("Average Salary Expected : " + salary);

		String designation = employee.getDesignation();
		System.out.println("Designation : " + designation);

	}
}
