package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.flipkart.com");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();  //handle Popup
	
	driver.findElement(By.xpath("//span[text()='Cart']")).click();  //click on cart
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Login']")).click(); //click on login button
}
}
