package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	double xCord;
	double yCord;
	
	
	public Point2D()
	{
		
	}
	
	public Point2D(double xCord, double yCord) {
		
		this.xCord = xCord;
		this.yCord = yCord;
		
	}
	
//	public String display(Point2D p)
//	{
//		return ("X1 : "+this.xCord+" Y1 : "+this.yCord+"\nx2 : "+p.xCord+" y2 : "+p.yCord);
//		
//	}
	
	
	public void acceptPoints() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Co-ordinates");
		System.out.println("Enter x- ");
		xCord=sc.nextDouble();
		
		System.out.println("Enter y- ");
		yCord=sc.nextDouble();
	}
	
	
	public boolean isEqual(Point2D p)
	{
		
//		System.out.println(this.xCord+" "+this.yCord);
//		System.out.println(p.xCord+" "+p.yCord);
		
		return this.xCord==p.xCord && this.yCord==p.yCord;
		
		
	}
	public String getDetails(Point2D p) {
		// TODO Auto-generated method stub
		
		return ("X1 : "+this.xCord+" Y1 : "+this.yCord+"\nx2 : "+p.xCord+" y2 : "+p.yCord);
			
		
//		System.out.println("x1- "+this.xCord);
//		System.out.println("y1- "+this.yCord);
//		System.out.println("x2- "+p.xCord);
//		System.out.println("y2- "+p.yCord);
		
	}
	
	public double calDistance(Point2D p)//this=p1
	{
		
			//a=(x2 – x1)² 
			//b= (y2 – y1)²
			//dist=sqrt(a+b)
		
			double dist;
			
			double a=Math.pow((p.xCord)-(this.xCord), 2);
			double b=Math.pow((p.yCord)-(this.yCord), 2);
			
			return dist=Math.sqrt((a+b));
			
			
		}
	}
	
	


