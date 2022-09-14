package org_tngday4;

import org.testng.annotations.DataProvider;

public class dataprovideeers {

	@DataProvider(name="login",indices= {1,2},parallel=true)
	private Object[][] datasss() {
		Object[][] o=new  Object[][] {
			{"aruj342@gmail","354737"},
			{"arun34532@gmail.com","787673999"},
			{"bata232@gamndi","63783"}
		};
		return o;
			
		

	}
}
