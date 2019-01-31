package vn.mmj.ymeetme.features.search;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.models.ConstantData;
import vn.mmj.ymeetme.steps.LandingPageSteps;
import vn.mmj.ymeetme.steps.LoginByFbSteps;
import vn.mmj.ymeetme.steps.ProfilePageSteps;
import vn.mmj.ymeetme.steps.SearchFormSteps;
import vn.mmj.ymeetme.steps.SearchResultPageSteps;
import vn.mmj.ymeetme.steps.TopMenuSteps;

@RunWith(SerenityRunner.class)
public class WhenUserSearchPartnerByAge {
	@Managed
	WebDriver driver;
	
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
		landingPageSteps.is_on_landing_page();
		landingPageSteps.open_fb_login_form();
		loginByFbSteps.login_by_fb_account(ConstantData.USERACCOUNT);
		topMenuSteps.open_whats_hot_page();
		topMenuSteps.open_search_page();
		searchFormSteps.clear_old_search_conditions();
		searchFormSteps.choose_max_age(ConstantData.MAX_AGE_SEARCH_CONDITION);
		searchFormSteps.choose_min_age(ConstantData.MIN_AGE_SEARCH_CONDITION);
		searchFormSteps.submit_search_form();
		// Scroll down and get data
		
		searchResultPageSteps.open_profile_page_from_firstc_card();
		assertThat(profilePageSteps.other_age_on_profile_page(), lessThanOrEqualTo(Integer.parseInt(ConstantData.MAX_AGE_SEARCH_CONDITION)));
		assertThat(profilePageSteps.other_age_on_profile_page(), greaterThanOrEqualTo(Integer.parseInt(ConstantData.MIN_AGE_SEARCH_CONDITION)));
	}

}
