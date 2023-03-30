package testCases;

import org.testng.annotations.Test;

import pages.IslamicBookHomePage;
import utiLites.BaseDriverSetup;

public class HomePageTest extends BaseDriverSetup  {
	
	IslamicBookHomePage islamicBookHomePage = new IslamicBookHomePage();
	@Test
	public void testHomePageUrl() {
		getDriver().get(islamicBookHomePage.HOME_PAGE_URL);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
