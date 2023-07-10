package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1 {
	
	//By using unique atrribute and text() function
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://twitter.com/i/flow/login");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='text']")).sendKeys("Soni123@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	//navigate to hotstar
	
	driver.navigate().to("https://www.hotstar.com/in/mypage#mp-login");
	Thread.sleep(2000);
}
}
