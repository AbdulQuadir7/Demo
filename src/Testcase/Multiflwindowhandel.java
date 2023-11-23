package Testcase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiflwindowhandel {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ABDUL%20AZIZ/Downloads/MultipleWindow%20(1).html");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.tagName("input")).click();
		 Set<String> Allwindowids = driver.getWindowHandles();
		 
		for(String ref : Allwindowids)
		{
		if(driver.switchTo().window(ref).equals("https://www.olivegarden.com/home"))	
		{
			
		break;	

		}	
			
		else {
			
			driver.close();
			
		}	
			
		driver.manage().window().maximize();	
			//driver.findElement(By.id());
			
		}
			
	}

}
