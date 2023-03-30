package testCases;

import org.testng.annotations.Test;

import pages.IslamicBookHomePage;
import pages.ProkashoniPage;
import utiLites.BaseDriverSetup;

public class ProkashoniPageTest extends BaseDriverSetup{
	HomePageTest homePageTest = new HomePageTest();
	IslamicBookHomePage islamicBookHomePage =  new IslamicBookHomePage();
	
	@Test
	public void enterSonchalonProkashoniTest() {
		homePageTest.testHomePageUrl();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		islamicBookHomePage.clickOnElement(islamicBookHomePage.PROKASHONI_LOCATOR);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		ProkashoniPage prokashoniPage = new ProkashoniPage();
		prokashoniPage.clickOnElement(prokashoniPage.SONCHALON_PROKASHONI);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
