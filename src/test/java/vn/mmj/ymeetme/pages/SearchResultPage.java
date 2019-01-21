package vn.mmj.ymeetme.pages;

import java.util.ArrayList;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends PageObject{

//	@FindBy(xpath="//div/span[3]")
//	ArrayList<WebElementFacade> ageOnScreen;
//	
//	public ArrayList<String> get_age_on_screen(){
//		ArrayList<String> ageTexts = new ArrayList<>();
//		for(WebElementFacade age : ageOnScreen) {
//			ageTexts.add(age.getText());
//		}
//		return ageTexts;
//	}
	
	@FindBy(xpath="//div[@id='list-view-1']/article/div/a/img")
	WebElementFacade firstCard;
	
	@FindBy(css="div.well.txt-center")
	WebElementFacade msgAtTheBottom;
	
	@FindBy(id="root")
	WebElementFacade windowRoot;
	
	public void click_to_first_card() {
		firstCard.click();
	}
	
	public void scroll_to_bottom() {
//		ArrayList<String> ages = new ArrayList<String>();
		int temp = 0;
		while (temp < windowRoot.getSize().height)
		{
			temp = windowRoot.getSize().height;
			evaluateJavascript("window.scrollTo(0, document.body.scrollHeight);");
		}
	}
}
