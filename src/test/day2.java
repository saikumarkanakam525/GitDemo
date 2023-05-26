package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	
	@Test(groups= {"Smoke"})
	public void ploan() 
	{
		System.out.println("Another test case which is part of Personal Loan Test Module");
	}
	
	@BeforeTest
	public void preday2()
	{
		System.out.println("Executed first in the folder");
	}

}
