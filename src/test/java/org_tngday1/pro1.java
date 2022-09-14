package org_tngday1;

import java.awt.GraphicsConfigTemplate;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_facebok;

public class pro1 extends baseclass{

	@BeforeClass
	private void befclass() {
		openedgedriver();
		impandmin();

	}
	@AfterClass
	private void aftcl() {
		quit();

	}

	@BeforeMethod
	private void befmet() {
		Date d=new Date();
		System.out.println("=====" +d);
	}
	@AfterMethod
	private void aftmet() {
		Date d=new Date();
		System.out.println("=====" +d);

	}
	@Test
	private void test1()  {
		get("https://www.facebook.com/");
		Assert.assertTrue(getcurrenturl().contains("facebook"));
		pom_facebok f=new pom_facebok();
		sendkey(f.getTextuser(), "arun");
		Assert.assertEquals("arun",getattributeinnt(f.getTextuser()) );
		sendkey(f.getTextpassword(), "5476348");
		Assert.assertEquals("5476348", getattributeinnt(f.getTextpassword()));
}
	
	@Test(priority=2,invocationCount=3)
	private void test2() {
		get("https://www.facebook.com/");
		pom_facebok f=new pom_facebok();
		SoftAssert a=new SoftAssert();
		a.assertTrue(getcurrenturl().contains("facebook"),"verify url");
		
		sendkey(f.getTextuser(), "arunr");
		a.assertEquals(getattributeinnt(f.getTextuser()), "arunr","verify user");
		sendkey(f.getTextpassword(), "12345");
		a.assertEquals(getattributeinnt(f.getTextpassword()), "1234");
		
}
		
	@Test(enabled=false)
	private void test3() {
		System.out.println("haru");

	}
	
	@Test(priority=2,invocationCount=5,enabled=true)
	private void test4() {
		System.out.println("baba");
		

	}
	
	
}