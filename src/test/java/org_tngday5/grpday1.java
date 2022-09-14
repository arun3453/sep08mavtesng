package org_tngday5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_facebok;
import org_tngday4.dataprovideeers;

public class grpday1 extends baseclass {
	
	 
	@Test(groups= {"smoke","regression"})
	private void test() {
		System.out.println("a1");
	}
	@Test(groups="smoke")
	private void test1() {
		System.out.println("a2");
	}
	@Test(groups="smoke")
	private void test2() {
		System.out.println("a3");
	}
	@Test(priority=3,invocationCount=3,enabled=true,groups= {"sanity","regression"})
	private void test3() {
		System.out.println("b1");
	}
	@Test(groups="sanity")
	private void test4() {
		System.out.println("b2");
	}
	@Test(groups="sanity")
	private void test5() {
		System.out.println("b3");
	}

	@Test(groups="regression")
	private void test6() {
		System.out.println("c1");
	}

	@Test(groups="regression")
	private void test7() {
		System.out.println("c2");
	}
	@Test(groups="regression")
	private void test8() {
		System.out.println("c3");
	}
	@Test(groups="retest")
	private void test9() {
		System.out.println("d1");
	}

	@Test(groups="retest")
	private void test10() {
		System.out.println("d2");
	}



}
