package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
	
		
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-jciruela0-3c0b8");
			sauceOptions.put("accessKey", "cca3a673-833a-4e66-b750-e8dbafd166e8");
			sauceOptions.put("build", "selenium-build-tytyt");
			sauceOptions.put("name", "<your test name>");
			browserOptions.setCapability("sauce:options", sauceOptions);
	//	WebDriver driver = new ChromeDriver();
		URL url;
		try {
			url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		//	driver.get(url.toString());
			
			
			
			
			RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
			driver.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
