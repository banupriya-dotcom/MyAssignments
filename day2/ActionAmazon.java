package week5.day2;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionAmazon {
	
	
	
	@Test
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java program\\LearnSelenium\\chromedriver\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("nav-search-submit-button")).click();
			
		String price = 	driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of the first product :  " + price);
		
		String rating = driver.findElement(By.xpath("(//span[@class='rush-component'])[5]")).getText();
		
		System.out.println("Price of the first product :  " + rating);
		
		driver.findElement(By.xpath("(//a[contains(@class,'a-text-normal')])[1]")).click();
		
	//TakesScreenshot srce = (TakesScreenshot)driver.getScreenshotAs(OutputType.FILE);
		
		//File des = new File("D:\\Java program\\LearnSelenium\\Screenshot\\image.png");
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		String totalCartPrice =driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		if	(price.equals(totalCartPrice)) {
			
			System.out.println("Product Price : "+price);
			System.out.println("Cart Price : " + totalCartPrice);
			
			System.out.println("Valid cart price");
			
		}
		else	{
			System.out.println("Product Price : "+price);
			System.out.println("Cart Price" + totalCartPrice);
			System.out.println("not Valid cart price");
		}
		
		
		
		
		driver.quit();
	}

}
