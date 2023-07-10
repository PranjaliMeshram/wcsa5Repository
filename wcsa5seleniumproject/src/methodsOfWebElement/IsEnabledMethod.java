package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("pranjali");
	driver.findElement(By.name("password")).sendKeys("pranjali123");
	driver.findElement(By.xpath("//button[contains[@class,'_acan _acap _acas _aj1-']")).isEnabled();
	
	boolean loginButton=driver.findElement(By.xpath("//button[contains[@class,'_acan _acap _acas _aj1-']")).isEnabled();
	
	System.out.println(loginButton);
	
}
}
