 package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPagePom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Verefy_FB_Login extends BaseClass {
	
	@Test
	public void VerefyLoginWith_Valid_Data() {
		
		LoginPagePom login=PageFactory.initElements(driver, LoginPagePom.class);
		login.getEmailid().sendKeys(excel.getStringData("Sheet1", 0, 0));
		login.getPassword().sendKeys(excel.getStringData("Sheet1", 0, 1));
		login.getLoginBtn().click();
		
		Library.Custom_Sendkeys(login.getEmailid(),excel.getStringData("Sheet1", 0, 0));
		Library.Custom_Sendkeys(login.getPassword(), excel.getStringData("Sheet1", 0, 1));
		 Library.Custom_Click(login.getLoginBtn());
	}

}
