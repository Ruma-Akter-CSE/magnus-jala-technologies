package sec_project;


import java.time.Duration;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.drive", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
		return driver;
	}
	
}
