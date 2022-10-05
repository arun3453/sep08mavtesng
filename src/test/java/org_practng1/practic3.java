package org_practng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;

public class practic3 extends baseclass{
	@Test
	private void test1() {
		openchromeBrowser();
		impandmin();
		get("https://www.google.com/");
		WebElement ser1 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		clik(ser1);
		WebElement set11 = driver.findElement(By.xpath("//a[text()='Sign in']"));
		clik(set11);
		WebElement sen2 = driver.findElement(By.name("identifier"));
		sendkey(sen2, "r.arun3453@gmail.com");
		WebElement ser3 = driver.findElement(By.xpath("//span[text()='Next']"));
		clik(ser3);
		
		

	}

}
