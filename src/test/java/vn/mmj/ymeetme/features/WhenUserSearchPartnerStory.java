package vn.mmj.ymeetme.features;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.steps.LandingPageSteps;
import vn.mmj.ymeetme.steps.LoginByFbSteps;
import vn.mmj.ymeetme.steps.SearchFormSteps;
import vn.mmj.ymeetme.steps.TopMenuSteps;
import vn.mmj.ymeetme.steps.WhatsHotPageSteps;

@RunWith(SerenityRunner.class)
public class WhenUserSearchPartnerStory {
	
	@Managed
	WebDriver driver;
	
	@Steps
	LandingPageSteps landingPageSteps;
	
	@Steps
	LoginByFbSteps loginByFbSteps;
	
	@Steps
	TopMenuSteps topMenuSteps;
	
	@Steps
	WhatsHotPageSteps whatsHotPageSteps;
	
	@Steps
	SearchFormSteps searchFormSteps;
	
	@Test
	public void search_partner_by_age() {
		// Open Landing page
		landingPageSteps.is_on_landing_page();
		// Click Login by Fb btn
		landingPageSteps.open_fb_login_form();
		// Login by Fb Account
		loginByFbSteps.login_by_fb_account("test.cani123@gmail.com", "hien_cani123");
		// Open Whats hot Page
		topMenuSteps.open_whats_hot_page();
		// Open Search page
		topMenuSteps.open_search_page();
		// Reset search conditions
		searchFormSteps.clear_old_search_conditions();
		// Select min_age
		searchFormSteps.choose_max_age("30");
		// Select max_age
		searchFormSteps.choose_min_age("30");
		// Click "Timf kieems btn"
		searchFormSteps.submit_search_form();
		//verify search result
		
	}
}
