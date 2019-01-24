package vn.mmj.ymeetme.pages;

import java.util.List;

//import java.util.ArrayList;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchForm extends PageObject{
	
	WebElementFacade age_min;
	WebElementFacade age_max;
	
	@FindBy(xpath="//h3[text()='Chòm sao']/following-sibling::div[1]/div/div")
	WebElementFacade constellation;
	                                                                              		
	WebElementFacade height_min;
	WebElementFacade height_max;
	WebElementFacade residence_country;
	
	@FindBy(xpath="//h3[text()='Nơi ở hiện tại']/following-sibling::div/div/div")
	WebElementFacade curCity;
	
	@FindBy(xpath="//h3[text()='Quê quán']/following-sibling::div[1]/div/div")
	WebElementFacade homeTown;
	
	@FindBy(id="fourthStep")
	WebElementFacade searchBtn;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElementFacade resetBtn;
	
	@FindBy(xpath="//div[contain(@aria-activedescendant, '--option-2')]")
	WebElementFacade songTu;
	
	public void click_reset_btn() {
		waitFor(resetBtn);
		resetBtn.click();
	}
	
	public void click_search_btn() {
		searchBtn.click();
	}

	public void select_max_age(String max_age) {
		waitFor(age_max);
		age_max.selectByValue (max_age);		
	}

	public void select_min_age(String min_age) {
		waitFor(age_min);
		age_min.selectByValue(min_age);		
	}
	
	public void select_body_types(String[] bodyTypes) {
		String element;
		WebElementFacade bd;
		evaluateJavascript("arguments[0].scrollIntoView(true)", $(String.format("//h3[text()='Quê quán']")));
		for (String bodyType : bodyTypes) {
			element = String.format("//label[text()='%s']", bodyType);
			bd = $(element);
			if (!bd.isSelected()) {
				bd.click();
			}
		}
	}

	public void select_constellations(String[] constellations) {
		String element;
		WebElementFacade cstl;
//		evaluateJavascript("arguments[0].scrollIntoView(true)", $(String.format("//h3[text()='Chòm sao']")));
		for (String constell : constellations) {
			constellation.click();
			element = String.format("//*[text()='%s']", constell);
			cstl = $(element);
			evaluateJavascript("arguments[0].scrollIntoView(true)", cstl);
			cstl.click();
		}
	}

}
