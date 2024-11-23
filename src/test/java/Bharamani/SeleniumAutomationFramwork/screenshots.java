package Bharamani.SeleniumAutomationFramwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	   File fs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   Files.copy(fs,new File("C:\\Users\\VARADRAJ\\OneDrive\\Desktop\\Selenium\\SeleniumAutomationFramwork\\screenshot\\flee.png"));
		
		driver.close();
		

	}

}
