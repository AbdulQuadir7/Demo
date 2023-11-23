package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com//");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String product = ("football");
		driver.findElement(By.xpath("//input[contains@placeholder,'Search']")).sendKeys(product);
		 List<WebElement> allautosugge = driver.findElements(By.xpath("//ul[@class='desktop-group]/li"));
		int size= allautosugge.size();
		System.out.println("total auto suggetion for"+ product+"is"+ size);
		
		
	}

}
