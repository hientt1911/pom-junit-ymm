package vn.mmj.ymeetme.steps;

import net.thucydides.core.annotations.Step;
import vn.mmj.ymeetme.pages.TopMenu;

public class TopMenuSteps {
	
	TopMenu topMenu;
	
	@Step
	public String list_top_menu_text(){
		return topMenu.get_top_menu_item_text();
	}

	@Step
	public void open_whats_hot_page() {
		topMenu.click_what_hot_menu();
	}
	
	@Step
	public void open_search_page() {
		topMenu.click_search_menu();		
	}

}