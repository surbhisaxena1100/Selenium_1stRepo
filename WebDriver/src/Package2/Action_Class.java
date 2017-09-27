package Package2;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action_Class  {
	
ChromeDriver driver;
Actions action;
	
	@BeforeTest
	public void TC001(){
		System.setProperty("webdriver.chrome.driver", "G:/selenium class/WebDriver/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void TC002(){
		action = new Actions(driver);
	    driver.findElementByName("email").sendKeys("asdgaksd");;
		action.sendKeys(Keys.CONTROL).sendKeys("a").sendKeys(Keys.CONTROL).sendKeys("c").build().perform();
		action.sendKeys(Keys.TAB).sendKeys(Keys.CONTROL).sendKeys("v").build().perform();
	}
	
	@Test
	public void TC003(){
		WebElement we1 = driver.findElementByLinkText("Web-App-Development");
		action.moveToElement(we1).click().build().perform();
		
	}
		

}
