package com.sunbeam.assign3_1;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total=0;
		Scanner sc=new Scanner(System.in);
		
		//Using Setter Getter
		 Invoice i=new Invoice();
		System.out.println("Enter Part Number");
		i.setPartNum(sc.next());
		
		System.out.println("Enter part Description");
		i.setDesc(sc.next());
		
		System.out.println("Enter Price per part");
		i.setPrice(sc.nextInt());
		
		System.out.println("Enter Quantity");
		i.setQuant(sc.nextInt());
		
		
		//by calling accept function
		Invoice i1=new Invoice();
		
		i1.acceptDetails();

		
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("part Number"+"   |  "+"Part Description"+"   |  "+"Quantity"+"   |  "+"Price per part");
		System.out.println("------------------------------------------------------------------");
		i.displayTotalAmount();
		//i.displayTotalAmount(i);
		i1.displayTotalAmount();
		Invoice i2=new Invoice("X0567","Battery",3,1000);
		//i2.displayTotalAmount(i2);
		i2.displayTotalAmount();
		
		total+=i.totalPrice();
		total+=i1.totalPrice();
		total+=i2.totalPrice();
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Total Bill- "+total);
		System.out.println("------------------------------------------------------------------");
		
		
//		Invoice i3=new Invoice();
//		i3.setPartNum("Hm345");
//		i3.getPartNum();
//		i3.setDesc("battery");
//		i3.getDesc();
//		i3.setPrice(-500);
//		i3.getPrice();
//		i3.setQuant(-2);
//		i3.getQuant();
//		System.out.println("Total Amount="+i3.displayTotalAmount());
//				

	}

}
