package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
	WebElement firstnametextfield=driver.findElement(By.name("firstname"));
	
	            Point points = firstnametextfield.getLocation();
	            System.out.println( points.getX());
	            System.out.println( points.getY());
	           Dimension dimension = firstnametextfield.getSize();
	            
	         System.out.println(dimension.getWidth()); 
	         System.out.println(dimension.getHeight()); 
	           
	       Rectangle rec = firstnametextfield.getRect();
	           
	       System.out.println(rec.getX()); 
	       System.out.println(rec.getY());
	       WebElement maleradiobutton = driver.findElement(By.xpath("//input[@name='sxe' and @value='2']"));
	       System.out.println(maleradiobutton.isSelected()+"befor clicking");
	       maleradiobutton.click();
	       
	       System.out.println(maleradiobutton.isSelected()+"after clicking");
	       
	       WebElement facebookImage = driver.findElement(By.xpath("//img[@alt='facebook']"));
	       
	       System.out.println( "facebook image is disable"+facebookImage.isDisplayed());
	       
	       driver.get("https://www.instagram.com/");
	       Thread.sleep(300);
	       
	       
	       
	       
	       
	       
	       
	           
	}
}
