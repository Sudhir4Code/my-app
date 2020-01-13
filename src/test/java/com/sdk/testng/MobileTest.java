package com.sdk.testng;

import org.testng.annotations.Test;

public class MobileTest {
	@Test(groups ={"smoke","mobile","functional"})
	public void MTest1(){
		System.out.println("Mobile Test1 is executed");
	}
	@Test(groups ={"mobile","functional"})
	public void MTest2(){
		System.out.println("Mobile Test2 is executed");
	}
	@Test(groups ={"mobile","functional"})
	public void MTest3(){
		System.out.println("Mobile Test3 is executed");
	}
	@Test(groups ={"smoke","mobile","functional"})
	public void MTest4(){
		System.out.println("Mobile Test4 is executed");
	}
}
