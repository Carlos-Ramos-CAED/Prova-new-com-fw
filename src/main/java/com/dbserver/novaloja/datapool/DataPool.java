package com.dbserver.novaloja.datapool;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataPool {
	  private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\ramosc\\Desktop\\datapool.csv";

	    public static void main(String[] args) throws IOException {
	        try (
	            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	            CSVReader csvReader = new CSVReader(reader);
	        ) {
	            // Reading Records One by One in a String array
	            String[] nextRecord;
	            while ((nextRecord = csvReader.readNext()) != null) {
	                System.out.println( nextRecord[0]);
	                System.out.println("==========================");
	            }
	        }
	    }
	
	
	
}
