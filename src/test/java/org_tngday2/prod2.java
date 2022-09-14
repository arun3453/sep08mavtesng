package org_tngday2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class prod2 {

	@Test
	private void tes1() {
		System.out.println("aa");
	}
	@Ignore
	@Test
	private void tes2() {
		System.out.println("ab");

	}
	@Test
	private void tes3() {
		System.out.println("ac");

	}

}
