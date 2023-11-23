package Testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SingleandmultipleDropDown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	   //identifying select tag 
		WebElement yeardropdown=driver.findElement(By.id("year"));
		Select select=new Select(yeardropdown);
		boolean multiple = select.isMultiple();
		
		if(multiple==true) {
		System.out.println("the drop down is multiple select ");
		
		}
		else {
			System.out.println("it is a single select");
		}
		System.out.println("verifing all option");
		List<WebElement> Alloption = select.getOptions();
		System.out.println("the total option are available in year dropdown -"+Alloption.size());
		int count=0;
		for(WebElement ref :Alloption) {
			count++;
			System.out.println("the"+count+"option is"+ref.getText());
			
			
		}
		
		
		
		
		
	}

}
