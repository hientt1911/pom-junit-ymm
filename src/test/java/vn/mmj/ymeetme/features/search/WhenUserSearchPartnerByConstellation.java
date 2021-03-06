package vn.mmj.ymeetme.features.search;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//import org.junit.Ignore;
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
public class WhenUserSearchPartnerByConstellation {
	
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
	public void search_partner_by_constellation() {
		List<String> myConstellation = new ArrayList<>();
		String CONSTELLATION_SEARCH_CONDITION[] = {"Bạch Dương", "Kim Ngưu", "Song Tử", "Cự Giải", "Bọ Cạp", "Xử Nữ", "Sư Tử", "Thiên Bình", "Nhân Mã", "Ma Kết", "Bảo Bình", "Song Ngư" };
		int randomNum = 0;
		for (int i = 0; i < 3; i++) {
			randomNum = ThreadLocalRandom.current().nextInt(0, 12);
			myConstellation.add(CONSTELLATION_SEARCH_CONDITION[randomNum]);
		}
		landingPageSteps.is_on_landing_page();
		landingPageSteps.open_fb_login_form();
		loginByFbSteps.login_by_fb_account(ConstantData.USERACCOUNT);
		topMenuSteps.open_whats_hot_page();
		topMenuSteps.open_search_page();
		searchFormSteps.clear_old_search_conditions();
		searchFormSteps.select_constellations_include(myConstellation);
		searchFormSteps.submit_search_form();		
		searchResultPageSteps.open_profile_page_from_firstc_card();
		assertThat(profilePageSteps.other_constellation_on_profile_page(), isIn(myConstellation));
	}
	
}