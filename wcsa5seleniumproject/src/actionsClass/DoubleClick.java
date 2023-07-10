package actionsClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {
	
	// use to perform doubleClick
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://laptop-83dojttd/login.do");
	
	new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
	
	//perform login operation
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	//HomePage
	new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
	
	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
	
	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	
	//use custom logo
	driver.findElement(By.id("uploadNewLogoOption")).click();
	
	//click on button to select the file
	 WebElement target=driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	
	//performDouble click
	 Actions act = new Actions(driver); 
	 act.doubleClick(target).perform();
	 
	 Thread.sleep(4000);
	 
	 File file = new File("./autoItPrograms/OmayoFileUpload.exe");
	 String abspath = file.getAbsolutePath();
	 Runtime.getRuntime().exec(abspath);
	 
	 Thread.sleep(4000);
	 Runtime.getRuntime().exec(abspath);
	 
	 //driver.close();
}
}
