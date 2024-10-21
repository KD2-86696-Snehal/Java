package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruits {
	
	
	
	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
	}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		
		return "sweet";
	}
}
