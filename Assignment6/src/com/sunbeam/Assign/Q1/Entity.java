package com.sunbeam.Assign.Q1;

public class Entity {
	String s;

	public Entity()
	{
		
	}
	public Entity(String s)  {
		
		this.s = s;
		
		
	}

	public String getS() {
		return s;
	}

	public void setS(String s) throws ExceptionLineTooLong{
		if(s.length()>80)
		{
			throw new ExceptionLineTooLong("String is Too Long...");
		}
		else {
		this.s = s;
		}
	}
	
}
