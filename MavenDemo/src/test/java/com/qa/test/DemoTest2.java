package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest2 {

	@Test
	
	public void SumTest2() {
		
		System.out.println("SUMTest2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
		
	}
	@Test
	public void SubTest2() {
		
		System.out.println("SUBTest2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
		
	}
	@Test
	public void MulTest2() {
	
	System.out.println("MULTest2");
	int a = 10;
	int b = 20;
	Assert.assertEquals(200, a*b);
	
}
	@Test
	public void DivTest2() {
	
	System.out.println("DIVTest2");
	int a = 10;
	int b = 20;
	Assert.assertEquals(2, b/a);
	
}
	
}
