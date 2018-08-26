package com.techcanvas.basics;

public class CompareEmployeeSal {
	
	
	
	private String EmployeeName ;
	private String EmployeeId ;
	private double EmployeeSal;
	
	
	public Employee(String name, String Id, double sal)
	
	{ EmployeeName= name;
	EmployeeId= Id;
	EmployeeSal= sal;
	
	}
	
	
	public class TaxcalLoops {
		
		public void testnewloops (int EmployeeSal)
		{
			if (EmployeeSal<=10000)
			{
				System.out.println("Tax is 0");
			}
			else  if(EmployeeSal<=80000)
			{
				System.out.println(" tax is 10% ");
			}
			
			else  if (EmployeeSal> 80000)
			{
				System.out.println(" tax is 20% ");
			}
			
			else
			{
				System.out.println(" invalid input ");
			}
			}
	
	public static void main(String[] args) {
		
		CompareEmployeeSal ta= new CompareEmployeeSal();
		ta.CompareEmployeeSal ()
		
	}
		
		
		

	}

}
