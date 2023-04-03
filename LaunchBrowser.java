package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();  //ChromeDriver
		driver.get("https://auth.ultimatix.net/utxLogin/login?TYPE=33554432&REALMOID=06-000e128c-664b-1c1a-9ba7-abcac0a8f081&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EdbHMX6T%2bWb8DN7DVmL5sbY%2bn%2b30S7n%2fgIBptYa9dLbudResX4AYm9ObPeNozoDH&TARGET=-SM-HTTPS%3a%2f%2fwww%2eultimatix%2enet%2futxHomeApp%2fredirectToHome%3fTARGET%3dhttps-%3A-%2F-%2Fwww%2eultimatix%2enet-%2Fuxportal-%2Fuxportalhome%2ehtml-%2FMegamenu");
		
		Thread.sleep(5000);
		//WebDriver driver=new FirefoxDriver(); //FirefoxDriver
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//WebDriver driver=new EdgeDriver(); //EdgeDriver
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//****Using WebDriverManager****//byMaven
		/*WebDriverManager.chromedriver().setup(); //ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		
		/*WebDriverManager.FirefoxDriver().setup();  //FirefoxDriver
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		
		/*WebDriverManager.EdgeDriver().setup();  //EdgeDriver
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		
		System.out.println("Page title is :"+driver.getTitle()); //To know the PageTitle
		System.out.println("Page current Url is :"+driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("1613287");
		
		//driver.findElement(By.name("authcode")).sendKeys("")
	}

}
