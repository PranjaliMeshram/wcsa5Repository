package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectingSingleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/SingleSelectDropdown.html");
		
		WebElement singleSelectDD=driver.findElement(By.id("menu"));
		
		Select sel=new Select(singleSelectDD);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		sel.deselectByIndex(2);
		Thread.sleep(2000);
	}

}
