package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendingdatabyusingjavascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   JavascriptExecutor jse= (JavascriptExecutor)driver;
	   WebElement usernametextfield = driver.findElement(By.name("email"));
	   String data="Abdul";
	   jse.executeScript("arguments[0].value=arguments[1]", usernametextfield,data);
	   
	   
	   
	   
	}

}
