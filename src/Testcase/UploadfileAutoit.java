package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadfileAutoit {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccountl");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	   Actions action=new Actions(driver); 
	   action.scrollByAmount(0, 400).perform();
	  WebElement upload=  driver.findElement(By.xpath("//button[contains(text(),'Upload')]"));
	  upload.click();
	  Runtime.getRuntime().exec("C:\\Users\\ABDUL AZIZ\\asd.exe");

	
	  
	   
		
		
		
	}

}
