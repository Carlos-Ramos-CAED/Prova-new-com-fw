package com.dbserver.novaloja.datapool;

import java.awt.List;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.util.Arrays;
import com.opencsv.CSVReader;

public class DataPool {
	
	private static final String SAMPLE = "C:\\Users\\ramosc\\Desktop\\datapool.csv";
	public static void main(String[] args) throws IOException {
	        try (
	            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE));
	            CSVReader csvReader = new CSVReader(reader);
	        ) {
	            // Reading Records One by One in a String array
	            String[] nextRecord;
	            while ((nextRecord = csvReader.readNext()) != null) {
	            	String[] x = nextRecord[0].split(";");
	            	System.out.println(x[0]);
	            	
	            	String[] xx = nextRecord[0].split(";");
	            	System.out.println(xx[1]);
	            }
	        } 
	    	
	    	/*CSVReader reader = new CSVReader(new FileReader(SAMPLE));
	    	java.util.List<String[]> mydados = reader.readAll();
	    	reader.close();
	    	
	    	for (String[] dado:mydados) {
	    		System.out.println(Arrays.toString(dado));
	    	}*/
	    	
	    	
	    	
	    	
	    }
	
	
	
}
