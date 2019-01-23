package vn.mmj.ymeetme.pages;

import java.util.List;

//import java.util.ArrayList;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchForm extends PageObject{
	
	WebElementFacade age_min;
	WebElementFacade age_max;
	
	@FindBy(css="div.Select.is-clearable.Select--multi")
	WebElementFacade constellation;
	
	@FindBy(xpath="//h3[text()='Chòm sao']/following-sibling::div/div/div/div[text()='Song Tử']")
	WebElementFacade songtu;
	
	WebElementFacade height_min;
	WebElementFacade height_max;
	WebElementFacade residence_country;
	
	@FindBy(id="react-select-3--value")
	WebElementFacade curCity;
	
	@FindBy(id="react-select-4--value")
	WebElementFacade homeTown;
	
//	@FindBy(xpath="//div[@id='body_type_ids']/div/label")
//	WebElementFacade randomBody;
//	
//	@FindBy(xpath="//div[@id='body_type_ids']/div[2]/label")
//	WebElementFacade thin;
//	
//	@FindBy(xpath="//div[@id='body_type_ids']/div[3]/label")
//	WebElementFacade medium;
//	
//	@FindBy(xpath="//div[@id='body_type_ids']/div[4]/label")
//	WebElementFacade sport;
//	
//	@FindBy(xpath="//div[@id='body_type_ids']/div[5]/label")
//	WebElementFacade strong;
//	
//	@FindBy(xpath="//div[@id='body_type_ids']/div[6]/label")
//	WebElementFacade fat;
//	
//	@FindBy(xpath="//div[@id='body_type_ids']/div[7]/label")
//	WebElementFacade big;
//	
//	@FindBy(xpath="//div[@id='body_type_ids']/div[8]/label")
//	WebElementFacade tall;
	
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
	
//	public void select_constellations(String con) {
//		constellation.click();
//		con.click();
//		
//		//constellation.selectByValue(con);
//	}
	
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
	
//	public void scrollTo(String label) {
//		getDriver().
//		
//	}
}
