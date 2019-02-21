package com.basicinheritance.AssingmentTwo;

public class Employee {
	static String CompanyName = "Capgemini";
	private String name = "Tushar";
	public int employeeId;
	protected int salary;

	public static String getCompanyName() {
		return CompanyName;
	}

	public String getName() {
		return name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	Employee(String name, int employeeId,int salary) {
		this.salary = salary;
		this.name = name;
		this.employeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	static final String main() {
		System.out.println(Employee.CompanyName);
		return CompanyName = "TCS";
	}

}