package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void bfClass()
	{
		System.out.println("Executed before the class day3");
	}
	
	
	@BeforeMethod
	public void beforeForEvery()
	{
		System.out.println("I will execute before every test method in day3 class");
	}
	
	@AfterMethod
	public void afterForEvery()
	{
		System.out.println("I will execute after every test method in day3 class");
	}
	
	@Parameters({"URL","APIKEY/Username"})
	@Test
	public void WebLoginCarLoan(String urlName, String key)
	{
		//Selenium
		System.out.println("weblogincar");
		System.out.println(urlName);
		System.out.println(key);
	}
	
	
	@Test
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("mobilelogincar");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileSigninCarLoan()
	{
		//Appium
		System.out.println("mobilesignincar");
	}
	
	
	
	@Test(dataProvider="getData")
	public void MobileSignoutCarLoan(String username, String password)
	{
		//Appium
		System.out.println("mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test(dependsOnMethods = {"WebLoginCarLoan"})
	public void LoginAPICarLoan()
	{
		//REST API
		System.out.println("APIlogincar");
	}
	
	@BeforeSuite
	public void Bfsuite() 
	{
		System.out.println("I am no.1");
	}
	
	@AfterClass
	public void afClass()
	{
		System.out.println("Executed after all the methods in the class");
	}
	
	
	@DataProvider
	public Object[][] getData() 
	{
		//1st combination - user with good credit history
		//2nd combination - user without credit history
		//3rd combination - user with fradulent credit history
		
		Object[][] data = new Object[3][2];   //Multidimensional array  //3 stand for rows -> number of combinations
		//2 Stand for columns -> number of parameters - Username and Password
		
		//1st dataset
		data[0][0]="first user name";
		data[0][1]="first password";
		
		
		//2nd dataset
		data[1][0]="second user name";
		data[1][1]="second password";
		
		//3rd dataset
		data[2][0]="third user name";
		data[2][1]="third password";
		
		return data;
		
		
		
		
		
		
	}
}
