package vn.mmj.ymeetme.features.search;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.isOneOf;
import static org.hamcrest.Matchers.isIn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.models.ConstantData;
import vn.mmj.ymeetme.models.UserAccount;
import vn.mmj.ymeetme.steps.LandingPageSteps;
import vn.mmj.ymeetme.steps.LoginByFbSteps;
import vn.mmj.ymeetme.steps.ProfilePageSteps;
import vn.mmj.ymeetme.steps.SearchFormSteps;
import vn.mmj.ymeetme.steps.SearchResultPageSteps;
import vn.mmj.ymeetme.steps.TopMenuSteps;
import vn.mmj.ymeetme.steps.WhatsHotPageSteps;

@RunWith(SerenityRunner.class)
public class WhenUserSearchPartnerByBodyTypes {
	
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
	
	@Steps
	SearchResultPageSteps searchResultPageSteps;
	
	@Steps
	ProfilePageSteps profilePageSteps;

	@Test
	public void search_partner_by_body_type() {
		landingPageSteps.is_on_landing_page();
		landingPageSteps.open_fb_login_form();
		loginByFbSteps.login_by_fb_account(ConstantData.USERACCOUNT);
		topMenuSteps.open_whats_hot_page();
		topMenuSteps.open_search_page();
		searchFormSteps.clear_old_search_conditions();
		searchFormSteps.choose_body_type_include(ConstantData.BODY_TYPE_SEARCH_CONDITION);
		searchFormSteps.submit_search_form();		
		searchResultPageSteps.open_profile_page_from_firstc_card();
//		assertThat(profilePageSteps.other_age_on_profile_page(), equalTo("30"));
//		assertThat(ConstantData.BODY_TYPE_SEARCH_CONDITION, hasItemInArray(profilePageSteps.other_body_type_on_profile_page())) ;
//		assertThat(profilePageSteps.other_body_type_on_profile_page(), isOneOf(ConstantData.BODY_TYPE_SEARCH_CONDITION));
		assertThat(profilePageSteps.otherBodyTypeOnProfilePage(), isIn(ConstantData.BODY_TYPE_SEARCH_CONDITION));
	}
}
