package com.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RunFailedTC2 {
	@Test
	@SuppressWarnings("deprecation")
	public void testWordpress(){
		System.out.println("wordpress is working as expected");
		Assert.assertTrue(false);
	}

}
