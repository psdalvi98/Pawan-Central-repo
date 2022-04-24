package Com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {
	
	@Test
	public void Iframe() {
		//frame(index)
		//frame(name or id)
		//frame(element)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Documents/demoiframe.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("maven");    //Switch to frame from main page
		
		driver.switchTo().defaultContent();   //Switch to main page from iframe
		
		driver.switchTo().frame(1);           //Switch to frame from main page
		
		driver.switchTo().parentFrame();       //Switch to Main frame
		
	}
	@Test
	public void Iframe2() {
		//frame(index)
		//frame(name or id)
		//frame(element)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Documents/demoiframe.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("maven");    //Switch to frame from main page
		
		driver.switchTo().defaultContent();   //Switch to main page from iframe
		
		driver.switchTo().frame(1);           //Switch to frame from main page
		
		driver.switchTo().parentFrame();       //Switch to Main frame
		
	}


}
