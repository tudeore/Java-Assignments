package com.collectionFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

	public int countWord(String file) throws IOException 
	{
		FileReader text = new FileReader(file);
		BufferedReader text1 = new BufferedReader(text);
		int counter = 0;
		String line = "";
		while ((line = text1.readLine()) != null) 
		{
			String[] word = line.split(" ");
			
			counter += word.length;
		}
		text.close();
		text1.close();
		return counter;

	}

}
