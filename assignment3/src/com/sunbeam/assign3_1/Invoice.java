package com.sunbeam.assign3_1;

import java.util.Scanner;

public class Invoice {

	 private String partNum;
	 private String desc;
	 private int quant;
	 private double price;
	 
	public Invoice() {
		this.quant=0;
		this.price=0.0;
		
	}
	public Invoice(String partNum, String desc, int quant, double price) {
		
		this.partNum = partNum;
		this.desc = desc;
		this.quant = quant;
		this.price = price;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
			this.quant = quant;
	}
	public double getPrice() {
		
		return price;
		
	}
	public void setPrice(double price) {
		
			this.price=price;
		
		
	}
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter part number");
		setPartNum(sc.next());
		
		
		
		System.out.println("Enter part Description");
		setDesc(sc.next());
		
		System.out.println("Enter Price per part");
		int amt=sc.nextInt();
		if(amt<0)
		{
			setPrice(0);
		}
		else{
			setPrice(amt);
		}
		
		
		System.out.println("Enter Quantity");
		int item=sc.nextInt();
		if(item<0)
		{
		setQuant(0);
		}
		else{
		setQuant(item);
		}
		
	}
	public double totalPrice()
	{
		double amt=0.0;
		amt=getPrice()*getQuant();
		return amt;
	}
	
//	public void displayTotalAmount(Invoice i)
//	{
//		
//		
//		System.out.println(i.getDesc() +"         |       "+i.getPartNum()+"     |     "+i.getQuant()+"     |     "+i.getPrice());
//		
//	}
	public void displayTotalAmount()
	{
		
		
		System.out.println(getPartNum()  +"         |       "+getDesc()+"     |     "+getQuant()+"     |     "+getPrice());
		
	}
	 
	 
	
	

}
