package vn.mmj.ymeetme.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GgLoginPage extends PageObject{

	@FindBy(id="identifierId")
	WebElementFacade gg_email_input;
	
	@FindBy(id="identifierNext")
	WebElementFacade next_btn_1;
	
	@FindBy(xpath="//input[@name='password']")
	WebElementFacade gg_pass_input;
	
	@FindBy(id="passwordNext")
	WebElementFacade next_btn_2;


	public void enter_gg_email(String email) {
		gg_email_input.sendKeys(email);
	}
	
	public void click_next_btn_1() {
		next_btn_1.click();
	}

	public void enter_gg_pass(String pass) {
		gg_pass_input.sendKeys(pass);
	}

	public void click_next_btn_2() {
		next_btn_2.click();
		this.switchToPage(TopMenu.class);
	}
	
	
	
	
	
}
