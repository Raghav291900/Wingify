package com.bussinesslogic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageObjectRepository.WingifyPage;

public class PageLogic {
	WebDriver driver;
	WebElement element;
	WingifyPage page;
	
	public PageLogic(WebDriver driver) {
		this.driver = driver;
	//	this.element = element;
		page = new WingifyPage(driver);
	}
	
	
	public void validateFunctionality() {
		driver.navigate().to("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlc\r\n" + 
				"mltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsI\r\n" + 
				"nZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9");
		page.clickOnHeatMapLink();
		switchToChildWindow();
		page.clickOnElementListTab();
		page.clickOnStartFreeTrialLink();		
	}
	
	public void switchToChildWindow() {
			Set<String> allWindows = driver.getWindowHandles();
			for (String child: allWindows) {
				driver.switchTo().window(child);
			}
	}
	
	
	
	
}
