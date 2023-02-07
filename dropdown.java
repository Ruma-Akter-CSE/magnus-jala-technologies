// search from google in website 

package sec_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=base.getDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		WebElement element=driver.findElement(By.className("form-control"));
		element.click();
		
        element.sendKeys("training@jalaacademy.com");
		
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		//submit
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a"));
		dropdown.click();
		
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[8]/a")).click();
      
		driver.findElement(By.xpath("//*[@id=\"btn-one\"]")).click();
		
		WebElement searchBox = driver.findElement(By.className("q"));
		searchBox.click();
		searchBox.sendKeys("the google from");
		
		searchBox.sendKeys(Keys.RETURN);
		
		driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > a")).click();

	
		 
        }
	}


