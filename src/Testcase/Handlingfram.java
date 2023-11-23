package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingfram
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement frameElement = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/photo-manager.html']"));
			driver.switchTo().frame(frameElement);
			WebElement draggingElement = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
			WebElement droppingElement = driver.findElement(By.id("trash"));
			Actions action = new Actions(driver);
			action.dragAndDrop(draggingElement, droppingElement).perform();
			driver.switchTo().defaultContent();
			driver.findElement(By.linkText("Home")).click();
		
		
		
		
		
	}
}
