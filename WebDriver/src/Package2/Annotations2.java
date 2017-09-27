package Package2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

	@Test
	public void check_annotation2()
	{
		System.out.println("this is a test method _annotation2");
	}
	
	
	@Test
	public void check6_annotation2()
	{
		System.out.println("this is a test method1 _annotation2");
	}
	
	
	public void check1_annotation2()
	{
		System.out.println("this is a method _annotation2");
	}
	
	
	@BeforeMethod
	public void check2_annotation2()
	{
		System.out.println("this is a before method _annotation2");
	}
	
	/*@BeforeTest
	public void check4_annotation2()
	{
		System.out.println("this is a before test _annotation2");
	}
	*/
	@BeforeClass
	public void check5_annotation2()
	{
		System.out.println("this is a before class _annotation2");
	}
	
}
