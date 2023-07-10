package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaStoreAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//To handle the notification popup
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co); //we need to pass the reference variable which we have created in order to handle the popup
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.puma.com/in/en/mens/mens-shoes?utm_source=GGL-SEA&utm_medium=PS&utm_aud=OTH&utm_obj=OLC&utm_campaign=PS_GGL_IN_PS_GGL_SEA_TXT_Brand_Category_FTW_agency_1000067495857508873&gclid=Cj0KCQjw4s-kBhDqARIsAN-ipH2Rytagh3HVzuCsQW0xQd7Bfq_LUv5dQrm3JEEN1PekRgTixAyoXfoaAmy-EALw_wcB");

		//identify the webElement
		WebElement shoeElement = driver.findElement(By.xpath("(//h3[contains(@class,'w-')]/descendant::span[text()='Puma Black-Puma Silver'])[2]"));

		//to perform scrolling operation
		Point loc = shoeElement.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-500)+")");
	}
}
