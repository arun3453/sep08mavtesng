package org_tngday2;

import org.testng.annotations.Test;

public class prod1 {
	@Test(enabled=false)
	private void tes1() {
		System.out.println("a");
	}
	@Test
	private void tes2() {
		System.out.println("b");

	}
	@Test
	private void tes3() {
		System.out.println("c");

	}

}
