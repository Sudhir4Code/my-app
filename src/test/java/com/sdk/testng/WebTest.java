package com.sdk.testng;

import org.testng.annotations.Test;

public class WebTest {
	@Test(groups = {"smoke","web","functional"})
	public void WTest1(){
		System.out.println("Web Test 1 is executed");
	}
	@Test(groups ={"web","functional"})
	public void WTest2(){
		System.out.println("Web Test 2 is executed");
	}
	@Test(groups ={"web","functional"})
	public void WTest3(){
		System.out.println("Web Test 3 is executed");
	}
	@Test(groups ={"web","functional"})
	public void WTest4(){
		System.out.println("Web Test 4 is executed");
	}
	@Test(groups= {"smoke","web","functional"})
	public void WTest5(){
		System.out.println("Web Test 5 is executed");
	}

}
