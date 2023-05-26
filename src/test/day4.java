package test;

import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void WebLoginHomeLoan()
	{
		//Selenium
		System.out.println("webloginhome");
	}
	
	
	@Test
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("mobileloginhome");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		//REST API
		System.out.println("APIloginhome");
	}
}
