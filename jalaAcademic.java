// select and upload the img from desktop

package sec_project;

import java.io.File;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jalaAcademic {
public static void main(String[] args) {
		
		WebDriver driver=base.getDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		
		
		WebElement element=driver.findElement(By.className("form-control"));
		element.click();
		
		
        element.sendKeys("training@jalaacademy.com");
		
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		//submit
		driver.findElement(By.id("btnLogin")).click();
		
	    driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[5]/a")).click();	
	    
	    driver.findElement(By.id("file")).sendKeys(new File("C:\\Users\\ADMIN\\Desktop\\result\\img1.jpg").getAbsolutePath());
	    
	 
	 driver.findElement(By.id("fileName"));
	  driver.findElement(By.xpath("//*[@id=\"frmImages\"]/div/div/div[1]/div[3]/button")).click();
		
	  //  driver.quit();
}

}
