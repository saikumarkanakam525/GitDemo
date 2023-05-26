package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("Executed first");
	}

	@Test
	public void toDO()
	{
		System.out.println("Inheritance");
	}
	
	@AfterMethod
	public void afMethod()
	{
		System.out.println("Executed last");
	}

}
