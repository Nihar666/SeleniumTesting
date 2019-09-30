package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
   public void testSoft(){
	   SoftAssert assertion = new SoftAssert();
	   System.out.println("Test 1 started:");
	   assertion.assertEquals(12, 13);
	   System.out.println("test 1 completes");
	   assertion.assertAll();
   }
	@Test
	public void testHardAssert(){
		System.out.println("Test 2 started");
		Assert.assertEquals(12, 23);
		System.out.println("Test 2 completes");
	}
}
