package com.techcanvas.basics;

public class TrycatchSample {
	private static String[] names= new String[] {"","",""};
	

	public static void main(String[] args) {
		TrycatchSample sample = new TrycatchSample();
		//System.out.println(names[3]);
		try
		{
			System.out.println(names[3]);
		}
		catch (Exception eobj)
		{eobj.printStackTrace();
		
		}
		finally
		{
			System.out.println("the code is out");
		}
		
	
	}

}
