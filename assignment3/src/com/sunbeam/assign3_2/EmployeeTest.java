package com.sunbeam.assign3_2;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary=0;
		double raiseSalary=0;
		Scanner sc=new Scanner(System.in);
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.acceptEmployees();
		e2.acceptEmployees();
		
		salary=e1.calYearySalary();
		raiseSalary=e1.calRasisedSalary(salary);
		e1.displayEmployees(salary,raiseSalary);
		
		salary=e2.calYearySalary();
		raiseSalary=e2.calRasisedSalary(salary);
		e2.displayEmployees(salary,raiseSalary);
		

		
		

	}

}
