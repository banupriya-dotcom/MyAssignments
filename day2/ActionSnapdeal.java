package week5.day2;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionSnapdeal {

	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java program\\LearnSelenium\\chromedriver\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
			driver.get("https://www.snapdeal.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			WebElement men =driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
			
			Actions action = new Actions(driver);
			action.moveToElement(men).build().perform();
			
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
	driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
	
	java.util.List<WebElement> shoeList = driver.findElements(By.xpath("//div[@class='product-tuple-image ']"));
	
	for	(int i=0;i<=shoeList.size();i++) {
		System.out.println("Total Shoe :" + i);
		
	}
		
			
		
			
			
			//driver.close();
			//driver.quit();
	}
}
