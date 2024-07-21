package generics;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	private WebDriver driver;

    // Constructor to initialize the WebDriver
    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void captureScreenShot(String fileName) throws IOException {
    	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	        try {
    	            FileUtils.copyFile(scrFile, new File("C:\\Users\\Dell\\Downloads/" + fileName+".png"));
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
}
}
