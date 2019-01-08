package vn.mmj.ymeetme.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FbLoginForm extends PageObject{
	
//	WebElementFacade email;
//	WebElementFacade pass;
	
	@FindBy(id ="email")
	private WebElementFacade email_input;
	
	@FindBy(id="pass")
	private WebElementFacade pass_input;
		
	@FindBy(id="u_0_0")
	private WebElementFacade login_btn;
	
	 
	
	public FbLoginForm(WebDriver driver) {
		super(driver);
	}
	
	public void enter_email(String email) {
//		email_input.sendKeys(email);
		typeInto(email_input, email);
	}
	
	public void enter_pass(String pass) {
//		pass_input.sendKeys(pass);
		typeInto(pass_input, pass);
	}
	
	public void click_login_btn() {
		login_btn.click();
		this.switchToPage(TopMenu.class);
	}
}
