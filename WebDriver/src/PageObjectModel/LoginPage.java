package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage  {
  ChromeDriver driver;
  public LoginPage(ChromeDriver Driver){
	  
	 this.driver=driver;
  }
	
	public void Usernameverification(String username){
		driver.findElementByXPath("//input[@id='email']").sendKeys(username);
		
	}
	public void Passwordverifiction(String Pass){
		driver.findElementByXPath("//input[@id='pass' or @name='pass']").sendKeys(Pass);
		
	}
	
	public void submit(){
		driver.findElementByXPath("//input[@id='u_0_r']").click();	
	}
	
	
	

}
