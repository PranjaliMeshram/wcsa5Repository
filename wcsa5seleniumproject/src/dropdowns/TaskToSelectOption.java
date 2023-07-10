package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//using single select dropdown
		driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/SingleSelectDropdown.html");

		WebElement dropDownElement=driver.findElement(By.id("menu"));

		Select sel=new Select(dropDownElement);

		//read all the options of dropdown
		 List<WebElement> allOptions = sel.getOptions();
		 
		 //To readlist use looping statement
		 for( WebElement op:allOptions)
		 {
			 if(op.getText().equals("Pani Puri"))
			 {
				 Thread.sleep(2000);
				 op.click();
				 break;
			 }
		 }
	}
}
