package vn.mmj.ymeetme.features.search;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class WhenUserLoginStoryTest {
	
	@Managed
	public WebDriver driver;
	
	@Steps
	public LoginSteps loginSteps;
	
	@Test
	public void login_with_valid_fb_account() {
		// Open Landing Page
		loginSteps.is_on_landing_page();
		
		// Login with Fb Account
		loginSteps.login_with_fb_account("test.cani123@gmail.com", "hien_cani123");
		
		// Verify Top menu appears
		//assumeTrue(b);
		
	}
	
	@Ignore
	@Test
	public void login_with_valid_gg_account() {
		// Open landing page
		loginSteps.is_on_landing_page();
		
		// Login with Gg account
		loginSteps.login_with_gg_account("test.cani123@gmail.com", "hien_cani123");
		
		// Verify Top menu appears
	}

}

