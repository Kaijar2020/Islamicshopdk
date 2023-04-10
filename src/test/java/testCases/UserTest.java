package testCases;

import org.testng.annotations.Test;

import pages.IslamicBookHomePage;
import pages.UserHandlePage;
import utiLites.BaseDriverSetup;

public class UserTest extends BaseDriverSetup {
	@Test
	public void testUser() {
		IslamicBookHomePage islamicBookHomePage = new IslamicBookHomePage();
		getDriver().get(islamicBookHomePage.HOME_PAGE_URL);
		UserHandlePage userHandlePage = new UserHandlePage();
		userHandlePage.clickOnElement(userHandlePage.CLICK_ON_ACCOUNT);
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
