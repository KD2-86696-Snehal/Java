package com.sunbeam.Assign.Q1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entity e=new Entity();
		Scanner sc=new Scanner(System.in);
		try {
			
		System.out.println("Enter a String");
		String s=sc.next();
		e.setS(s);
		
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		System.out.println(e.getS());
	}

}
