package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	// Read fortunes from this file
	private String fileName = "src/com/luv2code/springdemo/fortuneFile.txt";
	private String[] dataArray;
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		System.out.println(" >> FileFortuneService constructor");
	}
	
	@PostConstruct
	public void readFortunesFromFile() throws IOException {
		System.out.println(" >> FileFortuneService: call readFortunesFromFile() as PostConstruct method");
		
		BufferedReader reader = null;
		ArrayList<String> lines = new ArrayList<String>();
		File fortuneFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + fortuneFile);
		System.out.println("File exists: " + fortuneFile.exists());
		
		try {
		
			reader = new BufferedReader(new FileReader(fortuneFile));
			
			String line;
		    while ((line = reader.readLine()) != null) {
		    	lines.add(line);
//		        System.out.println("Current Line in file: " + line);
		    }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
		    try {
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
	
		// convert ArrayList to a String[]
		dataArray = lines.toArray(new String[]{});
	}

	@Override
	public String getFortune() {
		
		// pick a random string from the array
		int index = myRandom.nextInt(dataArray.length);
		String theFortune = dataArray[index];
		
		return theFortune;
	}
	
}
