package oug_day7;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(withoutknowingfail.class)
public class profailtest2 {
	@Test
	private void test1() {
		System.out.println("b1");

	}
	@Test(invocationCount=0)
	private void test2() {
		System.out.println("b2");

	}
	@Test
	private void test3() {
		Assert.assertTrue(false);
		System.out.println("b3");

	}

}
