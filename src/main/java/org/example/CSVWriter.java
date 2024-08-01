package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

	public void writeEmployeesToCSV(List<Employee> employees, String file) throws IOException {
		//take data from employeeList
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
			writer.write("id,name,position,Dep Name,Salary,hourly rate");
			for(Employee emp:employees){
				int id = emp.getId();
				String name = emp.getName();
				String position = emp.getPosition();
				String depName = emp.getDepartment();
				double Salary = emp.getSalary();
				double hourlyRate = emp.hourly_rate;
				writer.write(String.format("%d,%s,%s,%s,%f,%f",id,name,position,depName,Salary,hourlyRate));
			}
		}
	}
}
