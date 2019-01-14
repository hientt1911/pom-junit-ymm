package vn.mmj.ymeetme.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GgLoginPage extends PageObject{

	@FindBy(id="identifierId")
	WebElementFacade ggEmailInput;
	
	@FindBy(id="identifierNext")
	WebElementFacade nextBtn1;
	
	@FindBy(xpath="//input[@name='password']")
	WebElementFacade ggPassInput;
	
	@FindBy(id="passwordNext")
	WebElementFacade nextBtn2;


	public void enter_gg_email(String email) {
		ggEmailInput.sendKeys(email);
	}
	
	public void click_next_btn_1() {
		nextBtn1.click();
	}

	public void enter_gg_pass(String pass) {
		ggPassInput.sendKeys(pass);
	}

	public void click_next_btn_2() {
		nextBtn2.click();
//		this.switchToPage(TopMenu.class);
	}
	
	
	
	
	
}
