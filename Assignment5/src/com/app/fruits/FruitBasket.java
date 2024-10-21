package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc ,int choice)
	{
		System.out.println("----WELCOME to Juicy Fruits----");
		System.out.println("1.Add mango");
		System.out.println("2.Add Apple");
		System.out.println("3.Add Orange");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7.Enter index- ");
		System.out.println("8. Mark all sour fruits stale");
		System.out.println("0.exit");
		
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		return choice;
	}
	public static int basketSize(Scanner sc,int size)
	{
		System.out.println("Enter Basket Size- ");
		size=sc.nextInt();
		return size;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice = 0;
		int size=0;
		int count=1;
		int i = 0;
		
		size=basketSize(sc,size);
		Fruits basket[]=new Fruits[size];
		
		
		while((choice=menu(sc,choice))!=0)
		{
			
			
			switch(choice) {
			case 1:
			{
				if(count<size )
				{
				basket[count]=new Mango();
				basket[count].accept(sc);
				
				count++;
				//m=(Mango)f;
				//m.taste(sc);
				
//					if(f.isFresh)
//					{
//						basket[count++]=f;
//						count++;
//					}
					
			}
				else
				{
					System.out.println("your Basket is Full");
				}
			}
				break;
			case 2:
			{
				if(count<size)
				{
					basket[count]=new Apple();
					basket[count].accept(sc);
					count++;
//				
				}
				else
				{
					System.out.println("your Basket is Full");
				}
			}
			break;
			
			case 3:
			{
				if(count<size)
				{
					basket[count]=new Orange();
					basket[count].accept(sc);
					count++;
				}
				else
				{
					System.out.println("your Basket is Full :(");
				}
			}
			break;
			
			case 4:
			{
				System.out.println("---Name of the Fruits---");
				for(Fruits fruit:basket)
				{
					if(fruit!=null)
					{
						System.out.println(fruit.getName());
					}
				}
			}
			break ;
			
			case 5:
			{
				System.out.println("---Fruits Details---");
				for(Fruits fruit:basket)
				{
					if(fruit!=null)
					{
						System.out.println(fruit);
					}
				}
			}
			break;
			
			case 6:
			{
				System.out.println("Taste of all Stale Fruits-");
				for(Fruits fruit:basket)
				{
					
					if(fruit!=null && !fruit.isFresh)
					{
						System.out.println(fruit.getName()+" : "+fruit.taste());
					}
						
				}
			}
			break;
			
			case 7:
			{
				System.out.println("Enter index- ");
				i=sc.nextInt();
				if(i>=0 && i<count)
				{
					if(basket[i]!=null)
					{
						basket[i].setFresh(false);
					}
				}
			}
			break;
			         
			case 8:{
				for(Fruits fruit:basket)
				{
					if(fruit!=null && fruit.taste().equals("sour"))
					{
						fruit.setFresh(false);
					}
				}
			}
			break;
			case 0:
			{
				System.out.println("Thank you..!! Visit us again :)");
				System.exit(0);
			}
			break;
//			
			default:
			{
				System.out.println("Invalid Choice!!!");
			}
			
					
					
		}
		
	}

}
}

