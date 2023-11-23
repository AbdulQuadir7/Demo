package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class learningjavascrip 
{

public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	WebElement emailtextfield = driver.findElement(By.id("email"));
//	 JavascriptExecutor jse = (JavascriptExecutor)driver;
//	
//	jse.executeScript("arguments[o].style.border='10xp solid blue';",emailtextfield);
//	
//	Thread.sleep(3000);
//	
//	jse.executeScript("scrollBy", args)
//	
}
	
	
}
