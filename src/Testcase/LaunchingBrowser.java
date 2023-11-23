package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		
		
		
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='forgotten password?']")).click();
		Navigation nav=driver.navigate();
		Thread.sleep(3000);
		nav.back();
		nav.refresh();
		driver.quit();

//		String CurrentURL = driver.getCurrentUrl();
//		System.out.println(CurrentURL);
//
//		Options option = driver.manage();
//		Window window = option.window();
//
//		Point pointer = window.getPosition();
//		int xZise = pointer.getX();
//		int yZise = pointer.getY();
//
//		System.out.println(xZise + " This is X co-ordinator");
//		System.out.println(yZise + " This is y co-ordinator");
//		
//		
//	    Point set = new Point(200,300);
//	    window.setPosition(set);
//	    
	   // Dimension size= window.getSize();
	  // int width=size.getwidth();
	    
	   // Dimension dimension1 = new Dimension(200,300);
      
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		// window.maximize();
		// Thread.sleep(2000);
		
		// window.minimize();
		// Thread.sleep(2000);
		
		// window.fullscreen();
		// Thread.sleep(2000);
		// driver.close();

	}

}
