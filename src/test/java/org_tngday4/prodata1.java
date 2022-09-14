package org_tngday4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;
import org_day2.pageobjmod.pom_facebok;

public class prodata1 extends baseclass {
	@BeforeClass
	private void befc() {
		openedgedriver();
		impandmin();

	}
	@AfterClass
	private void aftc() {
		quit();

	}
	@BeforeMethod
	private void befm() {
		System.out.println("==================");

	}
	@AfterMethod
	private void aftm() {
		System.out.println("==================");
	} 
	@Test(dataProvider="login",dataProviderClass=dataprovideeers.class )
	private void test(String user,String pass) {
		get("https://www.facebook.com/");
		pom_facebok f=new pom_facebok();
		sendkey(f.getTextuser(), user);;
		sendkey(f.getTextpassword(), pass);
		clik(f.getClick());
		

	}
	
	

}
