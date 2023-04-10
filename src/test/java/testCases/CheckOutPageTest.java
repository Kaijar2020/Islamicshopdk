package testCases;





import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CheckOutPage;
import pages.IslamicBookHomePage;
import pages.ProkashoniPage;
import pages.SonchalonProkachoniPage;
import utiLites.BaseDriverSetup;

public class CheckOutPageTest extends BaseDriverSetup{
	
	CheckOutPage checkOutPage = new CheckOutPage();
	
	@Test
	public void testCheckOutProcess() {
		getDriver().get(checkOutPage.GOTO_CART);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//			 assertEquals(checkOutPage.getElement(checkOutPage.ACTUAL_TEXT).getText(), checkOutPage.EXPECTED_TEXT);

				
		 if (checkOutPage.getElement(checkOutPage.ACTUAL_TEXT).getText().equals(checkOutPage.EXPECTED_TEXT)) {
			 
			ProkashoniPageTest prokashoniPageTest =new ProkashoniPageTest();
			prokashoniPageTest.enterSonchalonProkashoniTest();
			SonchalonProkachoniPage sonchalonProkachoniPage = new SonchalonProkachoniPage();
			sonchalonProkachoniPage.hoVer(sonchalonProkachoniPage.SELECTED_BOOK);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			checkOutPage.clickOnElement(checkOutPage.ADD2CART);
			
		
			checkOutPage.clickOnElement(checkOutPage.CLICK_ON_PROCEED_CHECKOUT); 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			formFillup();
		}
		 else {
				checkOutPage.clickOnElement(checkOutPage.CLICK_ON_PROCEED_CHECKOUT); 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				formFillup();
		}
					
	}
	
	public void formFillup() {
		checkOutPage.clickOnElement(checkOutPage.FIRST_NAME_FIELD);
		checkOutPage.writeText(checkOutPage.FIRST_NAME_FIELD, "Ayon");
		setTimeDelay();
		checkOutPage.clickOnElement(checkOutPage.LAST_NAME_FIELD);
		checkOutPage.writeText(checkOutPage.LAST_NAME_FIELD, "Jomadder");
		setTimeDelay();
		checkOutPage.clickOnElement(checkOutPage.STREET_ADDRESS_FIELD);
		checkOutPage.writeText(checkOutPage.STREET_ADDRESS_FIELD, "Progati Sarani,Dhaka");
		setTimeDelay();
		checkOutPage.clickOnElement(checkOutPage.TOWN_or_CITY_FIELD);
		checkOutPage.writeText(checkOutPage.TOWN_or_CITY_FIELD, "Dhaka");
		setTimeDelay();
		
		
		/*
		 * Have issue
		checkOutPage.clickOnElement(checkOutPage.DISTRICT_FIELD);
		checkOutPage.dropeDown(checkOutPage.DISTRICT_FIELD, "Dinajpur");
		checkOutPage.scrollTillTarget(checkOutPage.SELECT_DISTRICT);
		checkOutPage.dropeDown(checkOutPage.SELECT_OPTION, "BD-06");
		*/
		
		checkOutPage.clickOnElement(checkOutPage.POSTAL_CODE_or_ZIP_FIELD);
		checkOutPage.writeText(checkOutPage.POSTAL_CODE_or_ZIP_FIELD, "Dhaka-1212");
		setTimeDelay();
		checkOutPage.clickOnElement(checkOutPage.PHONE_FIELD);
		checkOutPage.writeText(checkOutPage.PHONE_FIELD, "012309248");
		setTimeDelay();
		checkOutPage.clickOnElement(checkOutPage.EMAIL_ADDRESS_FIELD);
		checkOutPage.writeText(checkOutPage.EMAIL_ADDRESS_FIELD, "customer@gmail.com");
		setTimeDelay();
		checkOutPage.clickOnElement(checkOutPage.ORDER_NOTES_FIELD);
		checkOutPage.writeText(checkOutPage.ORDER_NOTES_FIELD, "I am waitong for a quick Ddelevary");
		setTimeDelay();
		
		
		
	
	}
	
	public void setTimeDelay(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
