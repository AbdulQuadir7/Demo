package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitly1
{

public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.spicejet.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Login']"));
	 loginbutton.click();
	
	 driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("8383838");
	// driver.findElement(By.xpath("//input[@data'']"));
	// driver.findElement(By.xpath("//div[text()='Login']"));
	WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(),'Abdul']"))));
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.xpath("//div[contains(),'Abdul']"))));
	driver.findElement(By.xpath("//div[contains(text(),'Abdul')]")).click();
	
	
	driver.findElement(By.xpath("//div[text()='log out']")).click();
	
	
	
	
	
	
	
	
	
}
	
}
