package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingTests {
	    @BeforeGroups (groups ={"sanity"})
		public void login(){
			System.out.println("login successful");
		}
		
		@AfterGroups (groups ={"sanity"})
		public void logout(){
			System.out.println("logout successful");
		}
		
		@Test (groups ={"sanity"})
		public void fundTransfer(){
			System.out.println("fund transfer");
		}
		
		@Test (groups ={"sanity","regression"})
		public void search(){
			System.out.println("search");
		}
		
		@Test (groups ={"regression"})
		public void billPayment(){
			System.out.println("bill payment");
		}

}
