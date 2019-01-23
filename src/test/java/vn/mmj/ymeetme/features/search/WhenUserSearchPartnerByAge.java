package vn.mmj.ymeetme.features.search;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.models.UserAccount;
import vn.mmj.ymeetme.steps.LandingPageSteps;
import vn.mmj.ymeetme.steps.LoginByFbSteps;
import vn.mmj.ymeetme.steps.ProfilePageSteps;
import vn.mmj.ymeetme.steps.SearchFormSteps;
import vn.mmj.ymeetme.steps.SearchResultPageSteps;
import vn.mmj.ymeetme.steps.TopMenuSteps;

public class WhenUserSearchPartnerByAge {
	
	@Steps
	LandingPageSteps landingPageSteps; 
	
	@Steps
	LoginByFbSteps loginByFbSteps;
	
	@Steps
	TopMenuSteps topMenuSteps;
	
	@Steps
	SearchFormSteps searchFormSteps;
	
	@Steps
	SearchResultPageSteps searchResultPageSteps;
	
	@Steps
	ProfilePageSteps profilePageSteps;
	
	@Test
	public void search_partner_by_age() {
		// Open Landing page
		landingPageSteps.is_on_landing_page();
		// Click Login by Fb btn
		landingPageSteps.open_fb_login_form();
		// Login by Fb Account
		UserAccount userAccount = new UserAccount("test.cani123@gmail.com", "hien_cani123");
		loginByFbSteps.login_by_fb_account(userAccount);
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
		// Submit search form 
		searchFormSteps.submit_search_form();
		// Scroll down and get data
		
		// Open profile Page
		searchResultPageSteps.open_profile_page_from_firstc_card();
		//verify search result
		assertThat(profilePageSteps.other_age_on_profile_page(), equalTo("30"));
	}

}