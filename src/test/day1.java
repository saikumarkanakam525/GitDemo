package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterSuite
	public void Afsuite() 
	{
		System.out.println("I am no.1 from last");
	}
	
	@AfterTest
	public void postday2()
	{
		System.out.println("Executed last in the folder");
	}
	
	@Test
	public void demo()
	{
		System.out.println("TestNG Framework");
		Assert.assertTrue(false);
	}

	
	@Test
	public void secondTest()
	{
		System.out.println("This is the second test case");
	}
	
	
	
}
