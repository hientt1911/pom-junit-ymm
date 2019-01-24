package vn.mmj.ymeetme.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import vn.mmj.ymeetme.common.PageObjectFacade;
import vn.mmj.ymeetme.models.ConstantData;

@DefaultUrl(ConstantData.URL)
public class LandingPage extends PageObjectFacade {
	
	@FindBy(css=".lp-btn--primary")
	WebElementFacade fbLoginBtn;
	
	@FindBy(css=".lp-btn--google")
	WebElementFacade ggLoginBtn;

	public void click_fb_login_btn() {
		fbLoginBtn.click();
		selectWindow();
	}
	
	public void click_gg_login_btn() {
		ggLoginBtn.click();
		this.switchToPage(GgLoginPage.class);
	}
}