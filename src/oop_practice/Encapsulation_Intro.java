package oop_practice;

import java.util.Scanner;

class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary < 1000) this.salary = 1000;
		else if(salary > 10000) this.salary = 10000;
		else this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		if(salary < 1000) this.salary = 1000;
		else if(salary > 10000) this.salary = 10000;
		else this.salary = salary;
	}
}

public class Encapsulation_Intro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id ");
		int id = sc.nextInt();
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Salary : ");
		int sal = sc.nextInt();
		
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(sal);

		System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
	}
}
