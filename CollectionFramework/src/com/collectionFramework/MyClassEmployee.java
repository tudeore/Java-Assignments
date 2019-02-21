package com.collectionFramework;

import java.io.Serializable;

public class MyClassEmployee implements Serializable
{
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public MyClassEmployee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "MyClassEmployee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "]";
		
	}
	
	
	
}
