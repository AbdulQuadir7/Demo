package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator 
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		
	  //  List<WebElement> languages = driver.findElements(By.className("_sv4"));
	 //  for(WebElement ele: languages)
	 //  {
		//System.out.println(ele.getText());   
		   
	 //  }
//	   List<WebElement> image = driver.findElements(By.tagName("img"));
//	   System.out.println(image.size());
//		   for(WebElement ref: image)
//		  {
//		System.out.println(ref.getTagName());   
//			   
		//WebElement forgotPasswordLink = driver.findElement(By.linkText("forgotpassword"));
		//forgotPasswordLink.click();
		
	//	driver.findElement(By.partialLinkText("Voting"));
		
//		WebElement singupref = driver.findElement(By.linkText("email"));
//		singupref.click();
//		
//		WebElement firstnametextfield = driver.findElement(By.name("firstname"));
//		
//		firstnametextfield.sendKeys("Abdul");
//		
//	
		WebElement emailtextfield = driver.findElement(By.id("email"));
		
		String tagofemail=emailtextfield.getTagName();
		System.out.println(tagofemail);
		 emailtextfield .sendKeys("Abdul");
		 
		  //=emailtextfield.getAttribute(name)
		 
		  }
		   
	   
	   
	   
}
	
	
	
	
	
	
	
	

