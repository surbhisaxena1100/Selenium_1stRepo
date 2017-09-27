package Package2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB_SignUP {
	ChromeDriver driver;
	
	@BeforeTest
	public void TC001(){
		System.setProperty("webdriver.chrome.driver", "G:/selenium class/WebDriver/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?specId=yidReg&altreg=0&.done=http%3A//mail.yahoo.com");
	}
	
	@Test 
	public void TC002(){
		driver.findElementByXPath("//input[@id='usernamereg-firstName']").sendKeys("surbhi");
		driver.findElementByXPath("//input[@id='usernamereg-lastName']").sendKeys("Saxena");
	}
	
	@Test
	public void TC003(){
		driver.findElementByXPath("//input[@id='usernamereg-yid']").sendKeys("surbhi.saxena");
	}
	
	@Test
	public void TC004(){
		driver.findElementByXPath("//input[@id='usernamereg-password' or @name='password']").sendKeys("Arjit@123");
		
	}
	@Test
	public void TC005(){
		driver.findElementByXPath("//input[@id='usernamereg-phone']").sendKeys("8527103023");
	}
	
	
	@Test
	public void TC006(){
	Select month = new Select(driver.findElementByXPath("//select[@id='usernamereg-month']"));
	month.selectByIndex(3);
	}
	
	@Test
	public void TC007() throws InterruptedException
	{
		//Select gender = new Select(driver.findElementByXPath("//input[@id='usernamereg-freeformGender']"));
		//gender.selectByIndex(1);
		driver.findElement(By.id("usernamereg-freeformGender")).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class= 'gender-container']/ul/li[1]").click();
	}
	
	//@AfterTest
	public void TC008(){	
		driver.close();
	}
	
	

}
