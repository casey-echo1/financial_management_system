package org.example;

public class Employee {
	int id;
	String name, position, department;
	double salary, hourly_rate;

	public Employee(int id, String name, String position, String department, double salary,
					double hourly_rate) {
		this.name = name;
		this.position = position;
		this.department = department;
		this.id = id;
		this.salary = salary;
		this.hourly_rate = hourly_rate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public double getHourly_rate() {
		return hourly_rate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" +
			position + ", department=" + department;
	}
}
