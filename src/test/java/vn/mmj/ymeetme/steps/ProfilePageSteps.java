package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.ProfilePage;

public class ProfilePageSteps {

	ProfilePage profilePage;
	
	@Step
	public Integer other_age_on_profile_page() {
		return profilePage.get_other_user_age();
	}
	
	@Step
	public String otherBodyTypeOnProfilePage() {
		return profilePage.get_other_user_body_type();
	}

	@Step
	public String other_constellation_on_profile_page() {
		return profilePage.get_other_user_constellation();
	}

	@Step
	public String other_cur_city_on_profile_page() {
		return profilePage.get_other_user_cur_city();
	}
}
