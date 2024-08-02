package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	public static List<Employee> readEmployeesFromCSV(String file) throws IOException {
		List<Employee> employees = new ArrayList<>();

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			String data;
			bufferedReader.readLine();
			while((data = bufferedReader.readLine() )!= null){
				String[] dataArr = data.split(",");
					int id = Integer.parseInt(dataArr[0]);//id
					String name = dataArr[1];//name
					double salary = Double.parseDouble(dataArr[2]);//salary
					String position = dataArr[3];//position
					String department = dataArr[4];//department
					double hourlyRate = Double.parseDouble(dataArr[5]);//hourly rate

			employees.add(new Employee(id, name, salary, position, department, hourlyRate));
			}


		}
		return employees;
	}


}
