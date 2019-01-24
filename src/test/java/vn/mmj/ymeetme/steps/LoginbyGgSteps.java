package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.models.UserAccount;
import vn.mmj.ymeetme.pages.GgLoginPage;

public class LoginbyGgSteps {
	
	GgLoginPage ggLoginPage;
	
	@Step
	public void login_with_gg_account(UserAccount userAcc) {
		ggLoginPage.enter_gg_email(userAcc.getEmail());
		ggLoginPage.click_next_btn_1();
		ggLoginPage.enter_gg_pass(userAcc.getPass());
		ggLoginPage.click_next_btn_2();		
	}
}
