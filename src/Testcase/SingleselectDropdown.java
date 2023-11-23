package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleselectDropdown
{
	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
   //identifying select tag 
	WebElement yeardropdown=driver.findElement(By.id("year"));
	Select select=new Select(yeardropdown);
	select.deselectByVisibleText("1998");
	Thread.sleep(30001);
	WebElement selected1=select.getFirstSelectedOption();
			System.out.println(selected1.getText());
			
	select.deselectByVisibleText("1990");
	Thread.sleep(30001);
	
	select.deselectByVisibleText("1978");

	WebElement selected2=select.getFirstSelectedOption();
	System.out.println(selected2.getText());
	
	
	
	}
}
