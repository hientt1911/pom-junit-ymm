package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.GgLoginPage;

public class LoginbyGgSteps {
	
	GgLoginPage ggLoginPage;
	
	@Step
	public void login_with_gg_account(String email, String pass) {
		ggLoginPage.enter_gg_email(email);
		ggLoginPage.click_next_btn_1();
		ggLoginPage.enter_gg_pass(pass);
		ggLoginPage.click_next_btn_2();		
	}
}
