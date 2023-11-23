package Prgmmmmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstprgmm {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ABDUL%20AZIZ/Desktop/.html/Dropdown.html");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element=driver.findElement(By.id("single"));
		
	Select select=new Select(element);
	Thread.sleep(3000);
	select.selectByValue("3");
	Thread.sleep(3000);
	
	}
	
	
	
	
}
