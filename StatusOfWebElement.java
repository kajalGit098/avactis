package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		username.submit();
		
//isDisplayed:- this method will verify method is displayed or not , will return boolean value
//isEnabled:-  this method will check element is enabled or not, will return boolean value
		
		/*
		 * WebElement
		 * searchstore=driver.findElement(By.xpath("oxd-input oxd-input--active"));
		 * System.out.println("Display status:"+searchstore.isDisplayed());
		 */
		
	}

}
