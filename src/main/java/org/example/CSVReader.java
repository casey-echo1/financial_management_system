package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	public static List<Employee> readEmployeesFromCSV(String file) throws IOException {
		FileReader fileReader = new FileReader(file);
		List<Employee> employees = new ArrayList<>();
		String data= null;
		try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {

			while((data = bufferedReader.readLine() )!= null){

				String[] dataArr = data.split(",");
				Employee employee = new Employee(Integer.parseInt(dataArr[0]),dataArr[1],
					dataArr[2],dataArr[3],Double.parseDouble(dataArr[4]),Double.parseDouble(dataArr[5]));

			employees.add(employee);
			}


		}
		return employees;
	}


}
