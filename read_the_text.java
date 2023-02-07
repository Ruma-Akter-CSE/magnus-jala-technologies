
// Read the Text and compare is true or false
package sec_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class read_the_text {
	
	public static void main(String[] args) {
		
		WebDriver driver=base.getDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		WebElement element=driver.findElement(By.className("form-control"));
		element.click();
		
        element.sendKeys("training@jalaacademy.com");
		
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		//submit
		driver.findElement(By.id("btnLogin")).click();
		

		WebElement homepage = driver.findElement(By.cssSelector("body > div.wrapper > div > div.row.text-center > center > h1"));
		String text_header = homepage.getText();
		System.out.println(text_header);
			
		//compare
		
		if(text_header.equals("Welcome to JALA Academy"))
		{
			System.out.println("Log in test success");
		}else
		{System.out.println("Log in test fail");
		
		}

		
	}

}
