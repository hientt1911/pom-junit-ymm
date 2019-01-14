package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.SearchForm;

public class SearchFormSteps {

	SearchForm searchForm;
	
	@Step
	public void clear_old_search_conditions() {
		searchForm.click_reset_btn();
	}
	
	@Step
	public void submit_search_conditions() {
		searchForm.click_search_btn();
	}

	public void choose_max_age(String max_age) {
		searchForm.select_max_age(max_age);
	}

	public void choose_min_age(String min_age) {
		searchForm.select_min_age(min_age);	
	}

	public void submit_search_form() {
		searchForm.click_search_btn();		
	}
}
