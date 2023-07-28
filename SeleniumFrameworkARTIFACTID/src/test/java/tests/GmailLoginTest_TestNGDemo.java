package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GmailIntroPageObjects;

public class GmailLoginTest_TestNGDemo {

	WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void finishingTest() {
		driver.close();
		driver.quit();
		System.out.println("genial");
	}
	
	
	@Test
	public void gmailTest() {
		
		
		GmailIntroPageObjects objects = new GmailIntroPageObjects(driver);
		
		driver.get("https://gmail.com");
		
		objects.setTextInTextBox("Selenium Rules");
		
		objects.clickNextButton();
		
	}
}
