package org_tngparllelday6;

import org.testng.annotations.Test;

public class par2 {
	@Test
	private void tes1() {
		System.out.println("b1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tes2() {
		System.out.println("b1");

		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tes3() {
		System.out.println("b3");
		System.out.println(Thread.currentThread().getId());

	}

}
