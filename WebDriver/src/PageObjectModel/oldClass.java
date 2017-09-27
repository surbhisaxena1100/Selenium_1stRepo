package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class oldClass {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void startBrower(){
		System.setProperty("webdriver.chrome.driver", "G:/selenium class/WebDriver/chromedriver.chromedriver.exe");
		driver.get("https://www.facebook.com/");	
	 }
	
	public void FBLogin(){
		driver.findElementByXPath("//input[@id='email']").sendKeys("hina.surbhi3@gmail.com");
		driver.findElementByXPath("//input[@id='pass' or @name='pass']").sendKeys("merepyaresai");
		driver.findElementByXPath("//input[@id='u_0_r']").click();	
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();	
		
			
	}
	

}
