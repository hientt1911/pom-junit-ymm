package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.FbLoginForm;

public class LoginByFbSteps {
	
	FbLoginForm fbLoginForm;
	
	@Step
	public void login_by_fb_account(String email, String pass) {
		fbLoginForm.enter_email(email);
		fbLoginForm.enter_pass(pass);
		fbLoginForm.click_login_btn();
	}	
}