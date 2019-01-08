package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.FbLoginForm;
import vn.mmj.ymeetme.pages.LandingPage;
import vn.mmj.ymeetme.pages.TopMenu;

public class LoginWithFbSteps {
	
	LandingPage landingPage;
	FbLoginForm fbLoginForm;
	
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
	
	
	

}
