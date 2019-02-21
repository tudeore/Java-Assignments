package com.collectionFramework;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestMyClassEmployee {

	private ListEmployees employeeList = new ListEmployees();

	ArrayList<MyClassEmployee> employeeListOne = new ArrayList<MyClassEmployee>();

	@Before
	public void employeesDetails() {
		MyClassEmployee employeeOne = new MyClassEmployee(120, "Tushar", 15000);
		MyClassEmployee employeeTwo = new MyClassEmployee(121, "Tejas", 20000);
		MyClassEmployee employeeThree = new MyClassEmployee(122, "Rohan", 30000);
		MyClassEmployee employeeFour = new MyClassEmployee(123, "Shubam", 35000);
		MyClassEmployee employeeFive = new MyClassEmployee(124, "dipika", 40000);

		employeeListOne.add(employeeOne);
		employeeListOne.add(employeeTwo);
		employeeListOne.add(employeeThree);
		employeeListOne.add(employeeFour);
		employeeListOne.add(employeeFive);
	}

	
	@Test
	public void testOfWriteFile() {

		ListEmployees employeeList = new ListEmployees();
		System.out.println(employeeListOne.toString());
		try {
			employeeList.write(employeeListOne, "employeeObjectFile.txt");
			// String actual =
			// "[MyClassEmployee [employeeId=120, employeeName=Tushar, salary=15000.0], MyClassEmployee [employeeId=121, employeeName=Tejas, salary=20000.0], MyClassEmployee [employeeId=122, employeeName=Rohan, salary=30000.0], MyClassEmployee [employeeId=123, employeeName=Shubam, salary=35000.0], MyClassEmployee [employeeId=124, employeeName=dipika, salary=40000.0]";
			assertEquals(
					"[MyClassEmployee [employeeId=120, employeeName=Tushar, salary=15000.0], MyClassEmployee [employeeId=121, employeeName=Tejas, salary=20000.0], MyClassEmployee [employeeId=122, employeeName=Rohan, salary=30000.0], MyClassEmployee [employeeId=123, employeeName=hubam, salary=35000.0], MyClassEmployee [employeeId=124, employeeName=dipika, salary=40000.0]]",
					employeeListOne.toString());
			System.out.println("hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void testOfReadFile() {

		System.out.println(employeeList);
		ListEmployees employeListTwo = new ListEmployees();
		try {
			try {
				employeListTwo.read(employeeListOne, "employeeObjectFile.txt");
				String S = "[MyClassEmployee [employeeId=120, employeeName=Tushar, salary=15000.0], MyClassEmployee [employeeId=121, employeeName=Tejas, salary=20000.0], MyClassEmployee [employeeId=122, employeeName=Rohan, salary=30000.0], MyClassEmployee [employeeId=123, employeeName=Shubam, salary=35000.0], MyClassEmployee [employeeId=124, employeeName=dipika, salary=40000.0]]";
				assertEquals(S, toString());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
