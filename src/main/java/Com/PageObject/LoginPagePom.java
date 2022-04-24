package Com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePom {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement Emailid;
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement loginBtn;
	
	public LoginPagePom(WebDriver driver){
		this.driver=driver;
		
	}

	public WebElement getEmailid() {
		return Emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

		

}
