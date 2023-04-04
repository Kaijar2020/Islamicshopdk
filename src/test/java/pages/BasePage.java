package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import static utiLites.BaseDriverSetup.getDriver;


public class BasePage {
	
	public WebElement getElement(By locator) {
		 return getDriver().findElement(locator);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
		
	}
	
	public void scrollTillTarget(By target) {
		WebElement el = getElement(target);
		JavascriptExecutor js =(JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();", el);	
	}

}
