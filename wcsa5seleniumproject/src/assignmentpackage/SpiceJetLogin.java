package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJetLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9898989898");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UrStupid");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73')]")).click();
	}
}
