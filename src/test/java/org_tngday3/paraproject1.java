package org_tngday3;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_alibaba;

public class paraproject1 extends baseclass {
	@BeforeClass
	private void befcls() {
		openedgedriver();
		impandmin();
		

	}
	@AfterClass
	private void aftcls() {
		quit();

	}
	@BeforeMethod
	private void befmet() {
		Date d=new Date();

		System.out.println("======="+d);
	}
	@AfterMethod
	private void aftmet() {
		Date d=new Date();
		System.out.println("======="+d);
	}
	@Parameters({"username"})
	@Test
	private void test(@Optional("androidphone")String user) {
		get("https://www.globalsources.com/?utm_source=1001005&WT.mc_id=1001005&WT.srch=1&msclkid=958a75038043140e392f1623aa7de3a1");
		pom_alibaba a=new pom_alibaba();
		sendkey(a.getSerch(), user);

	}

}
