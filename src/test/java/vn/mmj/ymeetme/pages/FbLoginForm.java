package vn.mmj.ymeetme.pages;

import java.util.ArrayList;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FbLoginForm extends PageObject{
		
	private WebElementFacade email;
	private WebElementFacade pass;
	
//	@FindBy(id ="email")
//	private WebElementFacade email_input;
//	
//	@FindBy(id="pass")
//	private WebElementFacade pass_input;
		
	@FindBy(id="u_0_0")
	private WebElementFacade loginBtn;
	
	
	public void enter_email(String emailAdd) {
		typeInto(email, emailAdd);
	}
	
	public void enter_pass(String pwd) {
		typeInto(pass, pwd);
	}
	
	public void click_login_btn() {
		String mainWindow = getDriver().getWindowHandle();
		loginBtn.click();		
		ArrayList<String> windows = new ArrayList<String>(getDriver().getWindowHandles());
		windows.remove(mainWindow);
		getDriver().switchTo().window(windows.get(0));
	}
}
