package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;



public class searchpom {
	private WebDriver driver; 
	
	
	
	// create the constructor
	public searchpom(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@type='text']")
	private WebElement seachtext;  
	
	@FindBy(xpath ="(//button[@type='button'])[4]")
	private WebElement clcikonseach;  
	
	@FindBy(xpath = "//img[@alt='Canon EOS 5D']")
	private WebElement  Productdisplayed;
	
	@FindBy(xpath ="//button[@data-original-title='Compare this Product']")
	private WebElement prdouctcompareionclcik;
	
	@FindBy(linkText ="product comparison")
	private WebElement clcikonprodcutcomprelist;
	
	
	
	
		public void seachtextproduct(String seachtext) {
		
		this.seachtext.sendKeys(seachtext);
	}
		public void clickon() {
			this.clcikonseach.click();
		}
		public void productimg() {
			this.Productdisplayed.click();
		}

		public void compareproductclcik() {
			this.prdouctcompareionclcik.click();
		}
		public void clickonproductcompare() {
			this.clcikonprodcutcomprelist.click();
		}
		public void asseration(String exp) {
			String actualtitile= driver.getTitle();
			 SoftAssert sa = new SoftAssert();
			 sa.assertEquals( actualtitile,exp);
			 System.out.println("Asseration is  passed By chromebrowser  it is Product Comparison page ");
			 sa.assertAll();
		}
		public void asserationpage(String exp) {
			String actualtitile= driver.getTitle();
			 SoftAssert sa = new SoftAssert();
			 sa.assertEquals( actualtitile,exp);
			 System.out.println("Asseration is  passed By chromebrowser  it is title page ");
			 sa.assertAll();
		}
		

		


}
