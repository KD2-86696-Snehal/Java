package com.sunbeam.Assign.Q2;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="karad";
		String s2 = "";
		for(int i=s1.length()-1; i>=0; i--)
		
		{
			
			s2=s2+s1.charAt(i); 
			
		}
		
		System.out.println("Reverse String= "+s2);
	}

}
