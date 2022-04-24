package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitTest1 {
	@Test
	public void PageScroll() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)","");    //Scoll by pixel
		
		WebElement amazon=driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		js.executeScript("arguments[0].scrollIntoView();",amazon);
		
	}

}
