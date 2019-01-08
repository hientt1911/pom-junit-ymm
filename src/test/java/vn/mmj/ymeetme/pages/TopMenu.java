package vn.mmj.ymeetme.pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TopMenu extends PageObject{
	
	@FindBy(css="a.nav__link--2")
	List<WebElementFacade> top_menu_items; 
	
	public List<String> get_top_menu_item_text(){
		List<String> menu_texts = new ArrayList<String>();
		for (WebElementFacade top_menu_item:top_menu_items)
		{
			menu_texts.add(top_menu_item.getText()) ;
		}	
		return menu_texts;
	}
}
