package org.failtestcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_facebok;

public class facefail extends baseclass {
	@BeforeClass
	private void bef() {
		openchromeBrowser();
		impandmin();
	}
	@BeforeMethod
	private void befmet() {
		System.out.println("====================");
	}
	@AfterClass
	private void aft() {
		quit();

	}
	@AfterMethod
	private void aftmet() {
		System.out.println("========================");

	}
	@Test
	private void test1() {
        get("https://www.facebook.com/");
		
		pom_facebok f=new pom_facebok();
		sendkey(f.getTextuser(), "arun");
		sendkey(f.getTextpassword(), "5476348");

	}
	@Test
	private void test2() {
        get("https://www.facebook.com/");
		pom_facebok f=new pom_facebok();
		sendkey(f.getTextuser(), "banana");
		sendkey(f.getTextpassword(), "lochib367e8");
		Assert.assertTrue(false);

	}

}
