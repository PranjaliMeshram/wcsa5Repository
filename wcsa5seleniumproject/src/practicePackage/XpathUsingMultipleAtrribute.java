package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingMultipleAtrribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class=' e1ax5wel1 default-ltr-cache-1arlfc3' and text()='Sign In']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='nfTextField error' and @type='text']")).sendKeys("Pranjali123@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='nfTextField error' and @type='password']")).sendKeys("pranjali123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small' and text()='Sign In']")).click();
	
}
}
