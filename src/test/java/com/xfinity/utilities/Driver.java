package com.xfinity.utilities;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Driver {
private static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver==null){
			switch (Config.getProperty("browser")) {
			case "chrome":
				System.setProperty(Config.getProperty("driverType"),
						Config.getProperty("driverPath"));
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", 	
						"C:\\Users\\etala\\OneDrive\\Documents\\Libraries\\drivers\\chromedriver.exe");
				driver = new FirefoxDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", 	
						"C:\\Users\\etala\\OneDrive\\Documents\\Libraries\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			}
		}
		return driver;
	}
	
	public static void closeDriver(){
		if(driver != null){
			driver.quit();
		}
	}
	
}