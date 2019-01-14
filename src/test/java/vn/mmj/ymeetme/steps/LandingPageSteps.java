package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.LandingPage;

public class LandingPageSteps {

	LandingPage landingPage;
	
	@Step
	public void is_on_landing_page() {
		landingPage.open();
	}
	
	@Step
	public void open_fb_login_form() {
		landingPage.click_fb_login_btn();
	}

	public void open_gg_login_page() {
		landingPage.click_gg_login_btn();
	}	
}