package com.techcanvas.basics;

public class TestIterativeForLoop {
	
	public void testforloop()
	{
	for (int i=0;i<=100;i++)
	
	{if (i %2 ==0)
	{
		System.out.println(i);
		
	}
	}
	}
	
	public void testwhileloop()
	{ int a=100;
	while (a>=0)
		
	{ if (a %2 != 0)
		
	{System.out.println(a);
		
	}
	
	a--;
	}
	}
	public String names[]= new String[10];
	public void readfromArray()
	{
	 for ( int i=0;i<names.length;i++)	
	 {
		 System.out.println(names[i]);
		 
	 }
	}
	

	public static void main(String[] args) {
		
		TestIterativeForLoop t= new TestIterativeForLoop();
		//t.testforloop();

		//TestIterativeForLoop t= new TestIterativeForLoop();
		//t.testwhileloop();
		t.readfromArray();
		

}
}