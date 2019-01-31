package vn.mmj.ymeetme.pages;

import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.support.events.EventFiringWebDriver;

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
		age_max.selectByValue(max_age);		
	}

	public void select_min_age(String min_age) {
		waitFor(age_min);
		age_min.selectByValue(min_age);		
	}
	
	public void select_body_types(String[] bodyTypes) {
		String element;
		WebElementFacade bd;
//		evaluateJavascript("arguments[0].scrollIntoView(true)", $(String.format("//h3[text()='Quốc Gia']")));
		evaluateJavascript("window.scrollBy(0, 400)");
		for (String bodyType : bodyTypes) {
			element = String.format("//label[text()='%s']", bodyType);
			bd = $(element);
			if (!bd.isSelected()) {
				bd.click();
			}
		}
	}
	
	public void select_constellations(List<String> mySao) {
		String element;
//		EventFiringWebDriver event = new EventFiringWebDriver(getDriver());
//		evaluateJavascript("arguments[0].scrollIntoView(true)", $(String.format("//h3[text()='Tuổi']")));
		evaluateJavascript("window.scrollBy(0, 200)");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		};
		for (String constell : mySao) {
			constellation.click();
			element = String.format("//*[text()='%s']", constell);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			$(element).click();
		}
	}

	public void choose_cur_country(String countrySearchCondition) {
		evaluateJavascript("window.scrollBy(0, 200)");
		residence_country.selectByVisibleText(countrySearchCondition);		
	}

	public void select_cur_cities(List<String> curCitySeardCondition) {
		String element;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
		evaluateJavascript("window.scrollBy(0, 100)");
		for (String city : curCitySeardCondition) {
			curCity.click();
			element = String.format("//*[text()='%s']", city);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			$(element).click();
		}
	}
}
