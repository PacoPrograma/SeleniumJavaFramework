package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {

	static String DIR_PROJ = System.getProperty("user.dir");
	static	Properties prop = new Properties();
	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {

		
		
		
		try {
			FileInputStream input = new FileInputStream(DIR_PROJ + "\\src\\test\\java\\config\\config.properties");
			
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void setProperties() {
		try {
			FileOutputStream output = new FileOutputStream(DIR_PROJ + "\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
