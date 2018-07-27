package com.dbserver.novaloja.datapool;

import org.dbserver.framework.datapools.CsvDatapool;
import org.dbserver.framework.datapools.IDatapool;

public class CsvLeitor {

	private static IDatapool ler;
	public static void main(String[] args) {

    ler = new CsvDatapool("C:\\Users\\ramosc\\Desktop\\datapool.csv");

    
    System.out.println(ler);
	}

	
	
	public IDatapool getDadosCsv() {
		return new CsvDatapool("C:\\Users\\ramosc\\Desktop\\datapool.csv");
	}
}
