package vn.mmj.ymeetme.features.login;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.models.ConstantData;
import vn.mmj.ymeetme.steps.LandingPageSteps;
import vn.mmj.ymeetme.steps.LoginbyGgSteps;
import vn.mmj.ymeetme.steps.TopMenuSteps;

@RunWith(SerenityRunner.class)
public class WhenUserLoginByGoogleAccountStory {

	@Managed
	public WebDriver driver;
	
	@Steps 
	public LandingPageSteps landingPageSteps;
	
	@Steps
	public LoginbyGgSteps loginByGgSteps;
	
	@Steps
	public TopMenuSteps topMenuSteps;
	
	@Test
	public void login_with_valid_gg_account() {
		landingPageSteps.is_on_landing_page();
		landingPageSteps.open_gg_login_page();
		loginByGgSteps.login_with_gg_account(ConstantData.USERACCOUNT);
		assertThat(topMenuSteps.list_top_menu_text(), equalTo("[Một nửa, Ai thích tôi, Trò chuyện]"));
	}
}
