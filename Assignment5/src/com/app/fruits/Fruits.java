package com.app.fruits;

import java.util.Scanner;

public abstract class Fruits {
	String color;
	double weight;
	String name;
	boolean isFresh=true;
	
	public Fruits()
	{
		
	}
	public Fruits(String color,double weight,String name)
	{
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	public Fruits(String color, double weight, String name, boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public void accept(Scanner sc)
	{
	System.out.println("Enter Fruit name- ");
	name=sc.next();
	System.out.println("Enter Fruit Color- ");
	color=sc.next();
	System.out.println("Enter Weight- ");
	weight=sc.nextDouble();
	
//	System.out.println("is fruit fresh- ");
//	isFresh=sc.nextBoolean();
	
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	public abstract String taste();
	
	
	@Override
	public String toString() {
		return "Fruits [name=" + name + "color=" + color + ", weight=" + weight +", isFresh=" + isFresh + "]";
	}
	

	

}


