package org_tngday2;

import org.testng.annotations.Test;

public class prod3 {

	@Test
	private void tes1() {
		System.out.println("111");

	}
	@Test
	private void tes2() {
		System.out.println("11");

	}
	
	@Test(invocationCount=0)
	private void tes3() {
		System.out.println("1");

	}

}
