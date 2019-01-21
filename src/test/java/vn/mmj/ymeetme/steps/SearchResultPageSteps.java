package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.ProfilePage;
import vn.mmj.ymeetme.pages.SearchResultPage;

public class SearchResultPageSteps {

	SearchResultPage searchResultPage;
	ProfilePage profilePage;
	
	@Step
	public void open_profile_page_from_firstc_card() {
		searchResultPage.click_to_first_card();
	} 
	
	@Step
	public void get_no_of_cards() {
		searchResultPage.scroll_to_bottom();
	}
	
}