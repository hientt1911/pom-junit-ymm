package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.FbLoginForm;
import vn.mmj.ymeetme.pages.GgLoginPage;
import vn.mmj.ymeetme.pages.LandingPage;

public class LoginSteps {
	
	LandingPage landingPage;
	FbLoginForm fbLoginForm;
	GgLoginPage ggLoginPage;
	
	@Step
	public void is_on_landing_page() {
		landingPage.open();
	}

	@Step
	public void login_with_fb_account(String email, String pass) {
		landingPage.click_fb_login_btn();
//		FbLoginForm fbLoginForm = landingPage.switchToPage(FbLoginForm.class);
		fbLoginForm.enter_email(email);
		fbLoginForm.enter_pass(pass);
		fbLoginForm.click_login_btn();

	}

	@Step
	public void login_with_gg_account(String email, String pass) {
		landingPage.click_gg_login_btn();
		ggLoginPage.enter_gg_email(email);
		ggLoginPage.click_next_btn_1();
		ggLoginPage.enter_gg_pass(pass);
		ggLoginPage.click_next_btn_2();		
		
	}
	
	
	

}
