package com.sdk.testng;

import org.testng.annotations.Test;

public class DesktopTest {
	
	@Test (groups = {"smoke","deskop","functional"})
	public void DTest1(){
		System.out.println("Desktop test 1 is executed");
	}
	@Test(groups = {"deskop","functional"})
	public void DTest2(){
		System.out.println("Desktop test 2 is executed");
	}
	@Test(groups = {"deskop","functional"})
	public void DTest3(){
		System.out.println("Desktop test 3 is executed");
	}
	@Test(groups = {"deskop","functional"})
	public void DTest4(){
		System.out.println("Desktop test 4 is executed");
	}
	@Test(groups = {"smoke","deskop","functional"})
	public void DTest5(){
		System.out.println("Desktop test 5 is executed");
	}

}
