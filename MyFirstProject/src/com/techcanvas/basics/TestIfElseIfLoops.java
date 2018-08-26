package com.techcanvas.basics;

public class TestIfElseIfLoops {
	
	public void testnewloops (int a, int b)
	{
		if (a>b)
		{
			System.out.println("a is greater");
		}
		else  if(b>a)
		{
			System.out.println(" b is greater ");
		}
		
		else  if (a==b)
		{
			System.out.println(" a n b are equal ");
		}
		
		else
		{
			System.out.println(" invalid input ");
		}
		}
	
	
	public void testSwitchCase (String dayoftheweek)
	{ 
		switch (dayoftheweek.toLowerCase())
		{
		case "monday":
		System.out.println("its a weekday");
		break;
		
		case "tuesday":
			System.out.println("its a weekday");
			break;
			
		case "saturday":
			System.out.println("its a weekend");
			break;
			
			default:
			System.out.println("not present");
			
				
		
	}
	}
	public static void main(String[] args) {
		TestIfElseIfLoops  t= new TestIfElseIfLoops();
		//t.testnewloops(-120,0);
		
		t.testSwitchCase("sunday");
	}
	
	

}
