package com.iesvirgendelcarmen.csv;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.csvreader.CsvReader;

public class TestCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CsvReader csvReader = null;
		try  {
			csvReader = new CsvReader("ejemplo.csv");
			csvReader.setDelimiter(',');
			while (csvReader.readRecord())
				System.out.println("Columna 1: " +  
						csvReader.get(0) + "\tColumna 2: " + 
							csvReader.get(1));
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if ( csvReader != null) csvReader.close();
		}

	}

}
