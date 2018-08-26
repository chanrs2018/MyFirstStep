package com.techcanvas.basics;

public class TestConditionalLoops {
	
	public void testloops (int a, int b)
	{
		if (a>b)
		{
			System.out.println(a+" is greater number");
		}
		else 
		{
			System.out.println(b+" is greater number");
		}
		}
	

	public static void main(String[] args) {
		TestConditionalLoops  t= new TestConditionalLoops();
		t.testloops(100,20);
		
	}

}
