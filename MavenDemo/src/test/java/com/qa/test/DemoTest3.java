package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest3 {

	@Test
	
	public void SumTest3() {
		
		System.out.println("SUMTest3");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
		
	}
	@Test
	public void SubTest3() {
		
		System.out.println("SUBTest3");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
		
	}
	@Test
	public void MulTest3() {
	
	System.out.println("MULTest3");
	int a = 10;
	int b = 20;
	Assert.assertEquals(200, a*b);
	
}
	@Test
	public void DivTest3() {
	
	System.out.println("DIVTest3");
	int a = 10;
	int b = 20;
	Assert.assertEquals(2, b/a);
	
}
	
}
