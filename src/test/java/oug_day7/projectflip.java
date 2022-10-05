package oug_day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import org_day1.bass.baseclass;

public class projectflip extends baseclass {
	@Ignore
	@Test
	private void test() throws AWTException, InterruptedException {
		openedgedriver();
		impandmin();
		get("https://www.flipkart.com/");
		WebElement f1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clik(f1);
		List<WebElement> f2 = driver.findElements(By.xpath("//input[@class='_3704LK']"));
//		WebElement a1 = f2.get(0);
//		a1.sendKeys("iphone");
		
		for(int i=0;i<f2.size();i++) {
			WebElement a = f2.get(i);
			a.sendKeys("iphone");
			for(int j=0;j<8;j++) {
			Robot r=new Robot();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println(getattributeval(a));
			}
			
		}
		

	}
	@Ignore
	@Test
	private void test2() throws AWTException, InterruptedException {
		openedgedriver();
		impandmin();
		toUrl("https://www.flipkart.com/");
		WebElement f1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clik(f1);
		WebElement f2 = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		sendkey(f2, "iphone");
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement findElement = driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		clickAndHold(findElement);
		List<WebElement> a2 = driver.findElements(By.xpath("//div[@class='_1QrT3s']"));
		for(int i=0;i<a2.size();i++) {
		WebElement a3 = a2.get(i);
		String a4 = a3.getText();
		System.out.println(a4);
		
		
		}}
	@Test
	private void test3() {
		openedgedriver();
		impandmin();
		get("http://demo.guru99.com/test/newtours/");
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	

		
	
}
