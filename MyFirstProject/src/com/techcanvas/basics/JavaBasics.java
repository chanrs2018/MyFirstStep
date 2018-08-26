package com.techcanvas.basics;

public class JavaBasics {

	public  int a = 10;

	private  String myname = "My First Class";

	float c;

	public  void display()
	{
		//System.out.println(a);
		System.out.println(myname);
		//System.out.println("Good Job");
	}
	
	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}
	
	public int addsum ( int a, int b)
	{
		return a+b;
				}

	public static void main (String[] args)
	{
		//display();
	}
}
