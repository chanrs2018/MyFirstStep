package com.techcanvas.basics;

public class ConstructorsPractice {
	public String firstname;
	public double value;
	
	
	public ConstructorsPractice()
	{
		firstname="Itsme";
		
	}
	
	public static void main(String[] args)
	{
	
		ConstructorsPractice cp= new ConstructorsPractice();
		System.out.println(cp.firstname);
	}
	}


