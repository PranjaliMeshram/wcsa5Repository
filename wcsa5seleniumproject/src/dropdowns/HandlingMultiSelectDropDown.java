package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/MultiSelectDropDown.html");
	
	WebElement multiSelectDD=driver.findElement(By.id("menu"));
	
	Select sel=new Select(multiSelectDD);
	
	//using Index
	sel.selectByIndex(1);
	
	Thread.sleep(2000);
	
	//using VisibleText
	sel.selectByVisibleText("Pani Puri");
	
	//using value
	sel.selectByValue("v5");
	
	//to deselect using index
	sel.deselectByIndex(3);
	Thread.sleep(2000);
	
	//to deselect using visible text
	sel.deselectByVisibleText("Misal Pav");
	Thread.sleep(2000);
	
	//to deselect using value
	sel.deselectByValue("v5");
	Thread.sleep(2000);
	
	//To Select multiple Options
	for(int i=0;i<5;i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(1000);
	}
	Thread.sleep(3000);
	
	//To deselect multiple options using for loop
	//for(int i=0;i<5;i++)
	//{
		//sel.deselectByIndex(i);
		//Thread.sleep(1000);
//	}
	 
	//To deselect multiple options using  deselectAll()
	sel.deselectAll();
}
}
