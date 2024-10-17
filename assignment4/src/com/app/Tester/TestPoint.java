package com.app.Tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point2D p1=new Point2D(5,8);
		Point2D p2=new Point2D(6,4);
		System.out.println("reurning points in string format");
		System.out.println(p1.getDetails(p2));
		
				
		Point2D p3=new Point2D();
		Point2D p4=new Point2D();
		
		p3.acceptPoints();
		p4.acceptPoints();
		
		
		
		
		//p1.isEqual(p2);
		
		
		if(p3.isEqual(p4))
		{
			System.out.println("points are Equal");
			System.out.println("points");
			p3.getDetails(p4);
		}
		else 
		{
		System.out.println("points");
		p3.getDetails(p4);
		System.out.println("Distance Between two points- "+ p3.calDistance(p4));
		}
	}

}
