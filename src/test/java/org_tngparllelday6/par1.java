package org_tngparllelday6;

import org.testng.annotations.Test;

public class par1 {
	@Test
	private void tes1() {
		System.out.println("a1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tes2() {
		System.out.println("a2");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tes3() {
		System.out.println("ca3");
		System.out.println(Thread.currentThread().getId());

	}

}
