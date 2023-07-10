package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/hp/Desktop/WCSA5/WebElement/MultiSelectDropDown1.html");

		WebElement dropDownElement=driver.findElement(By.id("branches"));

		Select sel=new Select(dropDownElement);
		
		for(int i=2;i<=11;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
        List<WebElement> allOpts = sel.getAllSelectedOptions();
        
        //for(WebElement op:allOpts)
        //{
        	//Thread.sleep(2000);
        	//System.out.println(op.getText());
        //}
        
        for(int i=0;i<allOpts.size();i++)
        {
        	Thread.sleep(2000);
        	System.out.println(allOpts.get(i).getText() );
        	//WebElement op = allOpts.get(i);
        	 //String value = op.getText();
        }

	}
}
