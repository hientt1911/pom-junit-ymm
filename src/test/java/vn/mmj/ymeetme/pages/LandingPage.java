package vn.mmj.ymeetme.pages;

import java.util.ArrayList;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://test.ymeet.me/")
public class LandingPage extends PageObject {
	
	@FindBy(css=".lp-btn--primary")
	WebElementFacade fbLoginBtn;
	
	@FindBy(css=".lp-btn--google")
	WebElementFacade ggLoginBtn;

	public void click_fb_login_btn() {
		fbLoginBtn.click();
		String defaultWindow = getDriver().getWindowHandle(); 
		ArrayList<String> windows = new ArrayList<String>(getDriver().getWindowHandles());
		windows.remove(defaultWindow);
		getDriver().switchTo().window(windows.get(0));
	}
	
	public void click_gg_login_btn() {
		ggLoginBtn.click();
		this.switchToPage(GgLoginPage.class);
	}
}