package vn.mmj.ymeetme.pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TopMenu extends PageObject{
	
	@FindBy(css="a.nav__link--2")
	List<WebElementFacade> top_menu_items; 
	
	@FindBy(xpath="a.nav__link.nav__link--2")
	WebElementFacade whatsHotMenuItem;
	
	@FindBy(linkText="TÌM KIẾM")
	WebElementFacade searchMenuItem;
	
	public String get_top_menu_item_text(){
		ArrayList<String> menu_texts = new ArrayList<String>();
		for (WebElementFacade top_menu_item:top_menu_items)
		{
//			System.out.println(top_menu_item.getText());
			menu_texts.add(top_menu_item.getText()) ;
		}	
		return menu_texts.toString();
	}

	public void click_whats_hot_menu() {
		waitFor(whatsHotMenuItem);
		whatsHotMenuItem.click();
	}
	
	public void click_search_menu() {
		waitFor(searchMenuItem);
		searchMenuItem.click();
		
	}

	public void click_what_hot_menu() {
		
		
	}
}
