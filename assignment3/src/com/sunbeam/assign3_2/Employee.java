package com.sunbeam.assign3_2;

import java.util.Scanner;

public class Employee {
	private String fName;
	private String lName;
	private double sal;
	
	public Employee()
	{
		
	}
	public Employee(String fName, String lName, double sal) {
	
		this.fName = fName;
		this.lName = lName;
		this.sal = sal;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void acceptEmployees()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("---Enter Employee Details---");
		System.out.println("Enter First Name- ");
		setfName(sc.next());
		
		System.out.println("Enter Last Name- ");
		this.setlName(sc.next());
		
		System.out.println("Enter monthly Salary- ");
		double s=sc.nextDouble();
		if(s>=0)
		{
			this.setSal(s);
		}
		
		
	}
	public double calYearySalary()
	{
		double yearlySalary=0;
		yearlySalary=sal*12;
		return yearlySalary;
	}
	
	public double calRasisedSalary(double salary)
	{
		double raisedSal;
		raisedSal=salary+(salary*0.1);
		return raisedSal;
	}
	public void displayEmployees(double salary,double raisedSal)
	{
		System.out.println("-------Employees------");
		System.out.println("Employee Name- "+this.getfName()+" "+this.getlName());
		System.out.println("Yearly Salary- "+salary);
		System.out.println("Raised Salary- "+raisedSal);
		
	}
}
