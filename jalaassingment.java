/**
//search name and count 
 * 
 */
package sec_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;
/**
 * @author ADMIN
 *
 */
public class jalaassingment {

	/**
	 * @param args
	 */
	@Test
	public static void main(String[] args) {
		
		WebDriver driver=base.getDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		
		WebElement element=driver.findElement(By.className("form-control"));
		element.click();
		
        element.sendKeys("training@jalaacademy.com");
		
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		//submit
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
		
		driver.findElement(By.cssSelector("#MenusDashboard > li.treeview.menu-open > ul > li:nth-child(2) > a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("Sowmya");
		driver.findElement(By.id("MobileNo")).sendKeys("8142691807");
		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
		
		Dimension totalname=driver.findElement(By.xpath("//*[@id=\"tblEmployee\"]/tbody/tr/td[1]")).getSize();
	    Assert.assertEquals(10, totalname);
    
	    driver.quit();
}
	}
