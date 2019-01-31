package vn.mmj.ymeetme.features.search;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;

import java.util.ArrayList;
import java.util.List;

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
import vn.mmj.ymeetme.steps.WhatsHotPageSteps;

@RunWith(SerenityRunner.class)
public class WhenUserSearchPartnerByCurCity {
	
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
	public void search_partner_by_current_city() {
		String countrySearchCondition = "Nhật Bản";
		List<String> curCitySeardCondition = new ArrayList<>();
		curCitySeardCondition.add("Akita");
		curCitySeardCondition.add("Tokyo");
		
		landingPageSteps.is_on_landing_page();
		landingPageSteps.open_fb_login_form();
		loginByFbSteps.login_by_fb_account(ConstantData.USERACCOUNT);
		topMenuSteps.open_whats_hot_page();
		topMenuSteps.open_search_page();
		searchFormSteps.clear_old_search_conditions();
		searchFormSteps.select_country(countrySearchCondition);
		searchFormSteps.select_cur_cities(curCitySeardCondition);
		searchFormSteps.submit_search_form();		
		searchResultPageSteps.open_profile_page_from_firstc_card();
		assertThat(profilePageSteps.other_cur_city_on_profile_page(), isIn(curCitySeardCondition));		
	}
}
