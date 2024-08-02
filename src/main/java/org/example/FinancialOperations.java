package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FinancialOperations {
	public static double getHourlyRateSum(List<Employee> employees) {
		double sum = 0;
		for(Employee employee : employees)	sum += employee.getHourly_rate();
		return sum;
	}
	public static double sumDepartmentSalary(List<Employee> employees, String department) {
		return employees.stream()
			.filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
			.mapToDouble(Employee::getSalary).sum();
	}

	public static double getAverageSalaryByDepartment(List<Employee> employees, String department) {
		return employees.stream()
			.filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
			.mapToDouble(Employee::getSalary).average().orElse(0.00);
	}

	public static double sumDepartmentHourlyRate(List<Employee> employees, String department) {
		return employees.stream()
			.filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
			.mapToDouble(Employee::getHourly_rate).sum();
	}
	public static double getAverageHourlyRateByDepartment(List<Employee> employees, String department) {
		return employees.stream()
			.filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
			.mapToDouble(Employee::getHourly_rate).average().orElse(0.00);
	}

	public static Map<String, Double> getTotalSalaryByDepartment(List<Employee> employees) {
		return employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.summingDouble(Employee::getSalary)));
	}
	public static Map<String, Double> getAverageSalaryByDepartment(List<Employee> employees) {
		return employees.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,
			Collectors.averagingDouble(Employee::getSalary)));
	}
	public static Map<String, Double> getTotalHourlyRateByDepartment(List<Employee> employees) {
		return employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.summingDouble(Employee::getHourly_rate)));
	}
	public static Map<String, Double> getAverageHourlyRateByDepartment(List<Employee> employees) {
		return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
			Collectors.averagingDouble(Employee::getHourly_rate)));
	}
	public static int getNumSum(int number) {
		int sum = 0;
		while(number > 0) {
			sum += number % 10;
			number /= 10;
		} return sum;

	}
	public static int getSumOfEmployeeIdDigits(List<Employee> employees) {
		return employees.stream()
						.mapToInt(Employee::getId)
						.map(FinancialOperations::getNumSum)
						.sum();
	}

}
/*
Hint: public static Map<String, Double> getAverageHourlyRateByDepartment(List<Employee> employees).
Use Collectors.groupingBy and Collectors.averagingDouble.
Hint: public static int getNumSum(int number). id = 303, return 3 + 3 + 0// return 6;

Use Helper method for getSumOfEmployeeIdDigits (no lambda needed) .
Hint: public static int getSumOfEmployeeIdDigits(List<Employee> employees).
Use mapToInt and map(use helper function here) and sum.
 */
