package com.collectionFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectRead {

	public boolean readWrite() throws ClassNotFoundException, IOException {
		Employee employeeOne = new Employee(123, "Tushar", 15000);
		String path = "C:/Users/tudeore/Desktop/ioFile";
		{
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(path);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeOne);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}
		Employee employeeTwo = null;
		{

			FileInputStream file = new FileInputStream(path);
			ObjectInputStream in = new ObjectInputStream(file);

			employeeTwo = (Employee) in.readObject();

			in.close();
			file.close();

		}
		return true;
	}
}
