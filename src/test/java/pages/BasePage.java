package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	
	public void hoVer(By locator) {
		Actions actions = new  Actions(getDriver());
		WebElement el = getElement(locator);
		actions.moveToElement(el).perform();
	}
	
	public void writeText(By locator ,String text) {
		WebElement el = getElement(locator);
		el.sendKeys(text);
	}
	public void dropeDown(By locator,String text) {
		WebElement el = getElement(locator);
		Select select = new Select(el);
		select.selectByVisibleText(text);
	}

}
