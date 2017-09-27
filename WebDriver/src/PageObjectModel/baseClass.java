package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	
	public ChromeDriver driver;
		
		@BeforeMethod
		public void TC001(){
			 System.setProperty("webdriver.chrome.driver" , "G:/selenium class/WebDriver/chromedriver/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
		}
       
		@AfterMethod
		public void TC003(){
			driver.close();	
		}
		
	}
		
		

