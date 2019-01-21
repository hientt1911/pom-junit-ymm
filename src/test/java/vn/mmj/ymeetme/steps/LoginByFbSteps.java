package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.models.UserAccount;
import vn.mmj.ymeetme.pages.FbLoginForm;

public class LoginByFbSteps {
	
	FbLoginForm fbLoginForm;
	
	@Step
	public void login_by_fb_account(UserAccount userAccount) {
		fbLoginForm.enter_email(userAccount.getEmail());
		fbLoginForm.enter_pass(userAccount.getPass());
		fbLoginForm.click_login_btn();
	}	
}