package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

private static WebDriver driver; 
	
	public static WebDriver getDriver(String driverName){

		if(driverName.equals(DriverNames.CHROME)){
			//System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
			
		}else if(driverName.equals(DriverNames.FIREFOX)){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(driverName.equals("IE")){
			// TODO 
		}else if(driverName.equals(DriverNames.PHANTOM)){
			// TODO 
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}


}
