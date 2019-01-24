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
import vn.mmj.ymeetme.steps.LoginByFbSteps;
import vn.mmj.ymeetme.steps.TopMenuSteps;

@RunWith(SerenityRunner.class)
public class WhenUserLoginByFacebookAccountStory {
		
	@Managed(driver="chrome")
	public WebDriver driver;
	
	@Steps
	public LandingPageSteps landingPageSteps;
	
	@Steps
	public LoginByFbSteps loginByFbSteps;
	
	@Steps
	public TopMenuSteps topMenuSteps;
	
	@Test
	public void login_with_valid_fb_account() {
		landingPageSteps.is_on_landing_page();
		landingPageSteps.open_fb_login_form();
		loginByFbSteps.login_by_fb_account(ConstantData.USERACCOUNT);
		assertThat(topMenuSteps.list_top_menu_text(), equalTo("[Một nửa, Ai thích tôi, Trò chuyện]"));
	}

}