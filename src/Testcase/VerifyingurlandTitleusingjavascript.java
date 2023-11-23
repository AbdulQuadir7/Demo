package Testcase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingurlandTitleusingjavascript
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   JavascriptExecutor jse= (JavascriptExecutor)driver;
	
	   String Title=jse.executeScript("return document.title").toString();
	   if(Title.equals("Log in to Facebook")) {
		   System.out.println("The test case pass");
	   }
	   else {
		   
		   
		   System.out.println("The test case fail");
	   }
	   
	   
	   String url=jse.executeScript("return document.URL").toString();
	   if(url.equals("https://www.facebook.com/login/")) {
		   System.out.println("The test case pass,having same url");
	   }
	   else {
		   
		   
		   System.out.println("The test case fail,having diff url");
	   }
	
	}
}
