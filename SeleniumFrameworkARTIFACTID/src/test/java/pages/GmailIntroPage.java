package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailIntroPage {

	
	private static WebElement element = null;
	
	public static WebElement textbox_acc_GmailIntroPage(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
		
		return element;
	}
}
