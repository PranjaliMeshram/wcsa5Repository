package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingTextFunction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("Pranjali123@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Pranjali123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
}
}
