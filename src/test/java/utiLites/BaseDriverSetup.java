package utiLites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriverSetup {
	
	private static String broWserName =System.getProperty("browser", "firefox"); 
	private static final ThreadLocal<WebDriver>LOCAL_DRIVER = new ThreadLocal<WebDriver>();
	
	//setting Driver
	public static void setDriver(WebDriver driver) {
		BaseDriverSetup.LOCAL_DRIVER.set(driver);
	}
	//Getting Driver
	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();
	}
	
	//getting the browser
	
	public static WebDriver getBrowser(String broWserName) {
		
		switch (broWserName.toUpperCase()) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			return new ChromeDriver(chromeOptions);
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
			
		case "EDGE":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
	
		default:
			throw new RuntimeException("Browser not Found "+broWserName);
		}
	}
	//setting Browser/ open browser
	@BeforeSuite
	public synchronized void setBrowser() {
		WebDriver webDriver = getBrowser(broWserName);
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}
	
	//close/quite browser
	@AfterSuite
	public synchronized void quiteBrowser() {
		getDriver().quit();
	}

}
