package PageObjectModel;

import org.testng.annotations.Test;

public class TC_001 extends baseClass {
	
	@Test
	public void TC_001_FBLogin(){
	LoginPage o = new LoginPage(driver);
	o.Usernameverification("abcd");
	o.Passwordverifiction("abcd");
	o.submit();
	
	}
}
