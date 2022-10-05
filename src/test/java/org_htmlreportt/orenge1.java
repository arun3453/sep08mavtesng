package org_htmlreportt;

import java.util.Date;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_facebok;

public class orenge1 extends baseclass {
	@BeforeClass
	private void befclass() {
		openedgedriver();
		impandmin();
		htmlstartrep("C:\\Users\\91805\\eclipse-workspace\\sep08mavtesng\\src\\test\\resources\\reports\\aa2.html");

	}
	@AfterClass
	private void aftcl() {
		quit();
		htmlendrep();

	}

	@BeforeMethod
	private void befmet() {
		Date d=new Date();
		System.out.println("=====" +d);
	}
	@AfterMethod
	private void aftmet(ITestResult r) {
		Date d=new Date();
		System.out.println("=====" +d);
		htmlcontindoce(r);

	}
	@Test
	private void test1()  {
		get("https://www.facebook.com/");
		Assert.assertTrue(false);
		pom_facebok f=new pom_facebok();
		sendkey(f.getTextuser(), "arun");
		sendkey(f.getTextpassword(), "5476348");
	
}
	
	@Test()
	private void test2() {
		get("https://www.facebook.com/");
		pom_facebok f=new pom_facebok();
		sendkey(f.getTextuser(), "arbabaun");
		sendkey(f.getTextpassword(), "76348");
		
		
		
}

}
