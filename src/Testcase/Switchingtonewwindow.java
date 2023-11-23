package Testcase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchingtonewwindow {
public static void main(String[] args) {
	

	
	
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	WebElement forgottenElement = driver.findElement(By.linkText("Forgotten account?"));
	
	
	 Actions action=new Actions(driver);
	 action.keyDown(Keys.CONTROL).click(forgottenElement).keyUp(Keys.CONTROL).perform();
	Set<String> AllwindowIdafterclickig = driver.getWindowHandles();
	
	//AllwindowIdafterclickig.remove();
}
	
}
