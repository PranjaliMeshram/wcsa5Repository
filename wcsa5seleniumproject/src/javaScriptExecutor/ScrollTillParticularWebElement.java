package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");

		//identify the WebElement
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));

		//to perform scrolling operations for a newsElement
		//Location of newsElement
		//Point loc = newsElement.getLocation();
		//int xaxis = loc.getX();
		//int yaxis = loc.getY();

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");
		jse.executeScript("arguments[0].scrollIntoView(true)",newsElement); //if i will passs the true then it will show the area below the web element i.e scrolling Down and if i pass false then kit will show the area above the webElement i.e scrolling Up
	}
}
