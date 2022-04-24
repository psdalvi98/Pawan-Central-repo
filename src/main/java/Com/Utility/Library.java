 package Com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	public static ExtentTest test;
	
	public static void Custom_Sendkeys(WebElement element, String value) {
		element.sendKeys(value);	
	}
	public static void Custom_Click(WebElement element) {
		element.click();
	}
	public static void Custom_handle_dropdown(WebElement element, String text) {
		Select S=new Select(element);
		S.selectByVisibleText(text);
		
	}
 
}
