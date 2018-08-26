package com.techcanvas.basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	@Test
	public void test()
	{
		System.out.println("Junit test");
	}
	
	@Test
	public void test2()
	{
		System.out.println("from secod case");
	}

	@Before
		public void before()
	{
		System.out.println("from before tag");
	}
	
	@After
	
	public void aftertest()
	{
		System.out.println("from after tag");
	}
	
	
	@BeforeClass
	
	public static void beforeclass()
	{
		System.out.println(" from beforeclass");
		}
	
    @AfterClass
	
	public static void afterclass()
	{
    	System.out.println(" from afterclass");
    	}
}
