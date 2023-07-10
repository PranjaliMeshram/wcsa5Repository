package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneAssignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.id("denyBtn")).click();
	
	//identify frame by using xpath
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
	
	//driver.switchTo().frame(9); //handle frame by using index
	//driver.switchTo().frame("fc_widget"); //handle frame by using (string name or id)
	driver.switchTo().frame(frameElement);
	
	WebElement chatbox = driver.findElement(By.id("chat-icon"));
	chatbox.click();
	//explicit wait
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("\"denyBtn\""))).click();
	
	//switch control again back to the main webpage
	
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	
	driver.findElement(By.id("chat-fc-name")).sendKeys("tuktuk");
	driver.findElement(By.id("chat-fc-email")).sendKeys("tuktuk@123");
	driver.findElement(By.id("chat-fc-phone")).sendKeys("7741005867");
	driver.findElement(By.xpath(""))
	
	
	
}
}
