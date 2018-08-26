package com.techcanvas.basics;

public class MethodOverloading {
	
	public void sum ( int a, int b)
	{ 
		System.out.println( a+b);
	}
	
	//method overloading with double
	public void sum ( double a, double b)
	{
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading over= new MethodOverloading ();
		over.sum(10.1, 10.1);
	}

}
