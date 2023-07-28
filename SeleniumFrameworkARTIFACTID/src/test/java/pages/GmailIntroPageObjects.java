package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailIntroPageObjects {
	
	WebDriver driver = null;
	
	By textbox_acc_GmailIntroPage = By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input");
	By button_next_Gmail_IntroPage = By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button");
	
	public GmailIntroPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInTextBox(String text) {
		driver.findElement(textbox_acc_GmailIntroPage).sendKeys(text);
	}
	
	public void clickNextButton() {
		driver.findElement(button_next_Gmail_IntroPage).click();
	}
}
