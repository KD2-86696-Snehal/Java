package com.sunbeam.generic.assign.Q1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class CityComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}
	
}

class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class MarksComparatorDesc implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}




public class Program01 {
	
	public static int menu(Scanner sc,int choice)
	{
//		
		//System.out.println("1.Add Studets");
		System.out.println("1.display students");
		System.out.println("2.sort on their city (asc)");
		System.out.println("3.sort on their on marks (desc)");
		System.out.println("4.sort on their on name (asc)");
		System.out.println("5.sort on the rollno");
		System.out.println("6.Enter Your Choice");
		System.out.println("0.Exit");
		choice=sc.nextInt();
		return choice;
		
	}
	
	public static void display(Student []arr) {
		System.out.println("----Students List----");
		for(Student s:arr)
		{
			System.out.println(s);
			
		}
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		int index=0;
		Student[] arr=new Student[6];
		arr[0]=new Student(4,"Snehal","Ichlakarnji",83.60);
		arr[1]=new Student(9,"Shweta","Kolhapur",85.90);
		arr[2]=new Student(3,"Rutuja","Pune",88.40);
		arr[3]=new Student(6,"Ashish","Sangli",79.60);
		arr[4]=new Student(2,"Harshada","Kolhapur",86.30);
		arr[5]=new Student(1,"Kushal","Karad",89.60);
		
				
		Comparator<Student>comparator;
		
		while((choice=menu(sc,choice))!=0) {
			
			switch(choice)
			{
			
			case 1:
			{
				display(arr);
				
			}
			break;
			
			case 2:
			{
				comparator=new CityComparator();
				Arrays.sort(arr,comparator);
				display(arr);
			}
			break;
			
			case 3:
			{
				comparator=new MarksComparatorDesc();
				Arrays.sort(arr,comparator);
				display(arr);
			}
			break;
			
			case 4:
			{
				comparator=new  NameComparator();
				Arrays.sort(arr,comparator);
				display(arr);
			}
			break;
			
			case 5:
			{
				Arrays.sort(arr);
				display(arr);
			}
			break;
			
			case 0:
			{
				System.exit(0);
			}
			break;
			
			default:
			{
				System.out.println("Invalid Choice...");
				
			}
			break;
			
			
			}
		}
		
		

	}

}
