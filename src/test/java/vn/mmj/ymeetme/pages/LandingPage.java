package vn.mmj.ymeetme.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://test.ymeet.me/")
public class LandingPage extends PageObject {
	
	@FindBy(css=".lp-btn--primary")
	WebElementFacade fb_login_btn;
	
	@FindBy(css=".lp-btn--google")
	WebElementFacade gg_login_btn;

	public void click_fb_login_btn() {
		fb_login_btn.click();
		this.switchToPage(FbLoginForm.class);
	}
	
	
}
