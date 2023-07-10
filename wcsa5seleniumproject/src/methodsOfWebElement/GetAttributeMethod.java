package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//driver.findElement(By.name("username")).sendKeys("admin");
	//driver.findElement(By.name("password")).sendKeys("admin123");
	
	WebElement usnTb=driver.findElement(By.name("username"));
	WebElement passTb=driver.findElement(By.name("password"));
	
	usnTb.sendKeys("admin");
	passTb.sendKeys("admin123");
	Thread.sleep(2000);
	usnTb.clear();
	passTb.clear();
	
	
	
}
}
