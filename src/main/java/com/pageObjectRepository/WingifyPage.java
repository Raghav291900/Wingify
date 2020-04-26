package com.pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WingifyPage {
	WebDriver driver;
	WebElement element;
	
	@FindBy (xpath= "")
	private WebElement heatMapLink;
	
	@FindBy (xpath = "")
	private WebElement elementListTab;
	
	@FindBy (xpath = "")
	private WebElement startFreeTrial;
	
	public WingifyPage(WebDriver driver) {
		this.driver = driver;
	//	this.element = element;
	}
	
	public void clickOnHeatMapLink() {
		element.click();
	}
	
	public void clickOnElementListTab() {
		element.click();
	}
	
	public void clickOnStartFreeTrialLink() {
		element.click();
	}
}
