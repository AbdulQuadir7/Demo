package Locators;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
public static void main(String[] args) throws Throwable {

	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.get("https://www.spicejet.com/");
//	WebElement loginbutton=driver.findElement(By.name("login"));
//	 File tempfile = loginbutton.getScreenshotAs(OutputType.FILE);
//	String timestemp = LocalDateTime.now().toString().replace(":", "-");
//	
//	 File parmanentfile = new File("./screenshot/"+timestemp+" loginbutton.jpeg");
//	 FileHandler.copy( tempfile, parmanentfile );

	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("loginBtn")).click();
	
	
	
	
	
}
}
