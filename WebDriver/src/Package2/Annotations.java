package Package2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void check()
	{
		System.out.println("this is a test method");
	}
	
	
	@Test
	public void check6()
	{
		System.out.println("this is a test method1");
	}
	
	
	public void check1()
	{
		System.out.println("this is a method");
	}
	
	
	@BeforeMethod
	public void check2()
	{
		System.out.println("this is a before method");
	}
	
	/*@BeforeTest
	public void check4()
	{
		System.out.println("this is a before test");
	}*/
	
	@BeforeClass
	public void check5()
	{
		System.out.println("this is a before class");
	}
}
