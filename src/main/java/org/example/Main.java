package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.example.FinancialOperations.sumDepartmentSalary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) throws IOException {

		List<Employee> employeeList = CSVReader
			.readEmployeesFromCSV("finance.csv");

		Map<String, Double> averageByDept = FinancialOperations
			.getAverageSalaryByDepartment(employeeList);
		System.out.println(averageByDept);



	}
}

