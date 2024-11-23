package Bharamani.SeleniumAutomationFramwork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class code {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("--headless");
	SoftAssert soft=new SoftAssert();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		//hard assertions
		//Assert.assertTrue(driver.getTitle().equals("xyz"));
		soft.assertTrue(driver.getTitle().equals("xyz"));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("cricbuzz");
		Thread.sleep(3000);
		
		driver.close();
		soft.assertAll();
		
		
		
		

	}

}
