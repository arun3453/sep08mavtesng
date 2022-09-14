package org_day2.pageobjmod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org_day1.bass.baseclass;

public class pom_alibaba extends baseclass{
	public pom_alibaba() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='inp']")
	private WebElement serch;

	@FindBy(xpath="//div[@class='search-btn']")
	private WebElement serchbut;
	@FindBy(xpath="(//div[@class='mod-prod-info'])[1]")
	private WebElement serch1;
	public WebElement getSerch() {
		return serch;
	}
	public WebElement getSerchbut() {
		return serchbut;
	}
	public WebElement getSerch1() {
		return serch1;
	}
}
