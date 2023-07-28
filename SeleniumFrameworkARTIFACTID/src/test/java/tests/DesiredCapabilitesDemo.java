package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilitesDemo {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("tachan");
		
		
		driver.close();
		driver.quit();
	}
}
