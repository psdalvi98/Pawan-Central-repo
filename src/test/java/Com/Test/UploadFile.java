package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	
	
	@Test
	public void UploadFile() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement file=driver.findElement(By.xpath("//input[@type='file']"));
		file.sendKeys("C:\\Users\\lenovo\\Desktop\\Pawan Resume\\File1\\ass.doc");
		Thread.sleep(4000);
		WebElement Checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		Checkbox.click();		
		
}
	@Test
	public void UploadFile2() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement file=driver.findElement(By.xpath("//input[@type='file']"));
		file.sendKeys("C:\\Users\\lenovo\\Desktop\\Pawan Resume\\File1\\ass.doc");
		Thread.sleep(4000);
		WebElement Checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		Checkbox.click();		
		
}
}
