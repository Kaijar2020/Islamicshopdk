package testCases;

import org.testng.annotations.Test;

import pages.IslamicBookHomePage;
import utiLites.BaseDriverSetup;

public class HomePageTest extends BaseDriverSetup  {

	
	@Test
	public void testHomePageUrl() {
		
		IslamicBookHomePage islamicBookHomePage = new IslamicBookHomePage();
		getDriver().get(islamicBookHomePage.HOME_PAGE_URL);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
