package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContains {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	
	driver.findElement(By.xpath("//input[contains(@name,'userLoginId')]")).sendKeys("Pranjali123@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Pranjali123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
}
}
