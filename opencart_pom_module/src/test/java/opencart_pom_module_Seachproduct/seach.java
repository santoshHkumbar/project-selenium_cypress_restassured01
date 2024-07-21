package opencart_pom_module_Seachproduct;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import generics.Screenshot;
import pom.searchpom;
import utility.DriverFactory;
import utility.DriverNames;

public class seach {
	private WebDriver driver;
	private String baseUrl;
	private searchpom searchpom;
	private Screenshot screenShot;
	ExtentHtmlReporter htmlrptr;
	ExtentReports extnt;
	ExtentTest test;

	
	
	
	
	@BeforeTest
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		searchpom = new searchpom(driver);
		screenShot = new Screenshot(driver);
		 htmlrptr= new ExtentHtmlReporter("first.html");
		 extnt= new ExtentReports();
		 extnt.attachReporter(htmlrptr);
		
		baseUrl = "https://tutorialsninja.com/demo/";
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
		extnt.flush();
	}
	@org.testng.annotations.Test
	public void myfirstproduct() throws IOException {
		ExtentTest test =extnt.createTest("opencart serach funactionality","search the product");
		test.log(Status.INFO,"this is asseration main page");
		searchpom.asserationpage("Your Store");
		test.pass("this is search the product in search field");
		searchpom.seachtextproduct("Canon EOS 5D");
		test.pass("clcik on search box");
		searchpom.clickon();
		test.pass("clcik on product");
		searchpom.productimg();
		test.pass("clcik on search box");
		searchpom.compareproductclcik();
		test.pass("clcik on productcompare icon");
		searchpom.clickonproductcompare();
		test.pass("capture the screenshoot of product comaprsion");
		screenShot.captureScreenShot("first");
		test.log(Status.INFO,"this is asseration last page");
		searchpom.asseration("Product Comparison");
		
		test.pass("test closed");
		
		
		
	}
	
	
}
