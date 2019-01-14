package vn.mmj.ymeetme.features;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.steps.LandingPageSteps;
import vn.mmj.ymeetme.steps.LoginbyGgSteps;

@RunWith(SerenityRunner.class)
public class WhenUserLoginByGoogleAccountStory {

	@Managed
	public WebDriver driver;
	
	@Steps 
	public LandingPageSteps landingPageSteps;
	
	@Steps
	public LoginbyGgSteps loginByGgSteps;
	
	@Ignore
	@Test
	public void login_with_valid_gg_account() {
		landingPageSteps.is_on_landing_page();
		landingPageSteps.open_gg_login_page();
		loginByGgSteps.login_with_gg_account("test.cani123@gmail.com", "hien_cani123");
	}
}
