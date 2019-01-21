package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.ProfilePage;

public class ProfilePageSteps {

	ProfilePage profilePage;
	
	@Step
	public String other_age_on_profile_page() {
		return profilePage.get_other_user_age();
	}
}
