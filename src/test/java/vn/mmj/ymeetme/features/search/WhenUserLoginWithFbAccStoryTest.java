package vn.mmj.ymeetme.features.search;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.steps.LoginWithFbSteps;

@RunWith(SerenityRunner.class)
public class WhenUserLoginWithFbAccStoryTest {
	
	@Managed
	public WebDriver driver;
	
	@Steps
	public LoginWithFbSteps loginWitFbSteps;
	
	@Test
	public void login_with_valid_fb_account() {
		// Open Landing Page
		loginWitFbSteps.is_on_landing_page();
		
		// Login with Fb Account
		loginWitFbSteps.login_with_fb_account("test.cani123@gmail.com", "hien_cani123");
		
		// Verify Top menu appears
		//assumeTrue(b);
		
	}
	
	@Ignore
	@Test
	public void login_with_valid_gg_account() {
		// Open landing page
		loginWitFbSteps.is_on_landing_page();
		
		// Login with Gg account
		
		// Verify Top menu appears
	}

}

