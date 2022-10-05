package org_practng1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;

public class practicday1 extends baseclass {
	@Test
	private void test1() throws AWTException, InterruptedException {
		openedgedriver();
		impandmin();
		get("https://www.thebodyshop.in/");
		WebElement a1 = driver.findElement(By.xpath("//img[@alt='search']"));
		clik(a1);
		WebElement a2 = driver.findElement(By.xpath("//input[@type='text']"));
		sendkey(a2, "body wash");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement b2 = driver.findElement(By.xpath("//p[text()='Lemon Purifying Hair & Body Wash']"));
		clik(b2);
		WebElement d1 = driver.findElement(By.id("rcc-decline-button"));
		clik(d1);
		WebElement a3 = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		clik(a3);
		WebElement b3 = driver.findElement(By.xpath("//span[text()='View Bag']"));
		Thread.sleep(1000);
		clik(b3);

		WebElement b4 = driver.findElement(By.xpath("//span[text()='Pay ₹ 1,195']"));
		Thread.sleep(1000);
		clik(b4);
		WebElement b5 = driver.findElement(By.xpath("//span[text()='Okay']"));
		Thread.sleep(1000);
		clik(b5);
		WebElement c1 = driver.findElement(By.name("login"));
		sendkey(c1, "8508883453");
	}

}
