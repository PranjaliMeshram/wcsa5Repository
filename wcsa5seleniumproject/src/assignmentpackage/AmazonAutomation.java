package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutomation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//go to the amazon
	driver.get("https://www.amazon.in/");
	
	//search for samsung mobiles
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");
	
	//click on search button
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	//click on the first result
	driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Samsung Galaxy M14 5G (Berry Blue, 6GB, 128GB Storage) | 50MP Triple Cam | 6000 mAh Battery | 5nm Octa-Core...']")).click();
	Thread.sleep(2000);
	
	//click on berry blue color
	//driver.findElement(By.xpath("//img[@alt='Berry Blue']")).click();
	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//p[text()='4GB + 128GB']")).click();
	//Thread.sleep(2000);
	
	//click on select location button
	WebElement target = driver.findElement(By.xpath("//div[text()='Select delivery location']"));
	
	//move to the location button
	 Actions act = new Actions(driver);
	 act.moveToElement(target).perform();
	 act.doubleClick(target).perform();
	Thread.sleep(2000);
	
	//enter the pincode into the textfield
	driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("411045");
	Thread.sleep(2000);
	
	//click on apply button
	driver.findElement(By.xpath("//span[text()='Apply']")).click();
	Thread.sleep(2000);
	
	
}
}
