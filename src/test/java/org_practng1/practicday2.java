package org_practng1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;

public class practicday2 extends baseclass{
	@Test
	private void test() {
		openedgedriver();
		impandmin();
		get("http://adactinhotelapp.com/");
		WebElement q1 = driver.findElement(By.name("username"));
		sendkey(q1, "arun3453");
		WebElement q2 = driver.findElement(By.name("password"));
		sendkey(q2, "arun8888");
		WebElement q3 = driver.findElement(By.name("login"));
		clik(q3);
		WebElement a1 = driver.findElement(By.name("location"));
		selectByVisibleText(a1, "London");
		WebElement a2 = driver.findElement(By.name("hotels"));
		selectByVisibleText(a2, "Hotel Hervey");
		WebElement a3 = driver.findElement(By.name("room_type"));
		selectByVisibleText(a3, "Deluxe");
		WebElement a4 = driver.findElement(By.name("room_nos"));
		selectByVisibleText(a4, "4 - Four");
		WebElement a5 = driver.findElement(By.name("datepick_in"));
		sendkey(a5, "30/09/2022");
		WebElement a6 = driver.findElement(By.name("datepick_out"));
		sendkey(a6, "01/10/2022");
		WebElement a7 = driver.findElement(By.name("adult_room"));
		selectByVisibleText(a7, "4 - Four");
		WebElement a8 = driver.findElement(By.name("child_room"));
		selectByVisibleText(a8, "1 - One");

		WebElement b1 = driver.findElement(By.name("Submit"));
		clik(b1);
		WebElement b2 = driver.findElement(By.name("radiobutton_0"));
		clik(b2);
		WebElement b3 = driver.findElement(By.name("continue"));
		clik(b3);
		WebElement c1 = driver.findElement(By.name("first_name"));
		sendkey(c1, "batsha");
		WebElement c2 = driver.findElement(By.name("last_name"));
		sendkey(c2, "RmR");
		WebElement c3 = driver.findElement(By.name("address"));
		sendkey(c3, "65,gandi park,mumbai");
		WebElement c4 = driver.findElement(By.name("cc_num"));
		sendkey(c4, "2345678900982312");
		WebElement c5 = driver.findElement(By.name("cc_type"));
		selectByVisibleText(c5, "Master Card");
		WebElement c6 = driver.findElement(By.name("cc_exp_month"));
		selectByVisibleText(c6, "April");
		WebElement c7 = driver.findElement(By.name("cc_exp_year"));
		selectByVisibleText(c7, "2020");
		WebElement c8 = driver.findElement(By.name("cc_cvv"));
		sendkey(c8, "212");
		WebElement c9 = driver.findElement(By.name("book_now"));
		clik(c9);
		String o1 = getattributeval(c9);
		System.out.println(o1);
		WebElement d1 = driver.findElement(By.name("my_itinerary"));
		clik(d1);
		List<WebElement> f1 = driver.findElements(By.tagName("td"));

		for(int i=0;i<f1.size();i++) {
			WebElement w1 = f1.get(i);
			String t1 = w1.getText();
			System.out.println(t1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
