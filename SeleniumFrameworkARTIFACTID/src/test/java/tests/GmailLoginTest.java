package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GmailIntroPageObjects;

public class GmailLoginTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		gmailTest();
	}
	
	public static void gmailTest() {
		
	
		
		String projectPath = System.getProperty("user.dir");
		WebDriver driver = new ChromeDriver();
		
		GmailIntroPageObjects objects = new GmailIntroPageObjects(driver);
		
		driver.get("https://gmail.com");
		
		objects.setTextInTextBox("Selenium Rules");
		
		objects.clickNextButton();
		
	}
}
