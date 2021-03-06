package vn.mmj.ymeetme.steps;

import java.util.List;

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
	
	@Step
	public void choose_max_age(String max_age) {
		searchForm.select_max_age(max_age);
	}
	
	@Step
	public void choose_min_age(String min_age) {
		searchForm.select_min_age(min_age);	
	}

	@Step
	public void submit_search_form() {
		searchForm.click_search_btn();		
	}
	
//	public void select_constellations_include(String[] constellationSearchCondition) {
//		searchForm.select_constellations(constellationSearchCondition);
//	}
	
	@Step
	public void select_constellations_include(List<String> constellationSearchCondition) {
		searchForm.select_constellations(constellationSearchCondition);
	}

	@Step
	public void choose_body_type_include(String[] bodyTypeSearchCondition) {
		searchForm.select_body_types(bodyTypeSearchCondition);		
	}

	@Step
	public void select_country(String countrySearchCondition) {
		searchForm.choose_cur_country(countrySearchCondition);		
	}

	public void select_cur_cities(List<String> curCitySeardCondition) {
		searchForm.select_cur_cities(curCitySeardCondition);		
	}

}
