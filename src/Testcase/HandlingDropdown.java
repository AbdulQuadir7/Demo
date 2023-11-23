package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
   //identifying select tag 
	WebElement daydropdown=driver.findElement(By.id("day"));
	
	Select select=new Select(daydropdown);
	select.deselectByVisibleText("7");
	Thread.sleep(20001);
//	select.selectByValue("9");
//	Thread.sleep(2000);
//	select.deselectByIndex(0);
//	
	WebElement monthdropdown=driver.findElement(By.id("day"));
	Select select1=new Select(monthdropdown);
	select1.deselectByVisibleText("5");
	Thread.sleep(20001);
	
	WebElement yeardropdown=driver.findElement(By.id("day"));
	Select select2=new Select(yeardropdown);
	select2.deselectByVisibleText("2001");
	Thread.sleep(20001);
	
}	
}
