package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application");
	}
	@AfterTest
	public void logoutToApplication() {
		System.out.println("Logout to application");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected");
	}
	
	@AfterMethod
	public void disconnectToDB() {
		System.out.println("DB dis-connected");
	}
	@Test(priority=1,description="This is Login test")
	public void loginTest() {
		System.out.println("Login is sucessfull");

	}

	@Test(priority=2,description="This is Logout test")
	public void logoutTest() {
		System.out.println("Logout is sucessfull");

	}
	
}
