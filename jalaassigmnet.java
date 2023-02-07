/**

button enable or disable check
 * 
 */
package sec_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author ADMIN
 *
 */
public class jalaassigmnet {

	/**
	 * @param args
	 */
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
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a"));
		
        boolean isEnabled = button.isEnabled() && button.isDisplayed();
       if (isEnabled) {
            System.out.println("Text is enabled");
        } else {
         System.out.println("Text is disabled");
        }
		
	}

}
