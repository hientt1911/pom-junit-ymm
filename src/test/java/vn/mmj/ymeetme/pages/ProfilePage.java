package vn.mmj.ymeetme.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProfilePage extends PageObject{

	@FindBy(xpath="//td[text()='Tuổi']/following-sibling::td")
	WebElementFacade otherUserAge;
	
	@FindBy(xpath="//td[text()='Chòm sao']/following-sibling::td")
	WebElementFacade otherUserConstellation;
	
	@FindBy(xpath="//td[text()='Dáng người']/following-sibling::td")
	WebElementFacade otherUserBodyType;
	
	@FindBy(xpath="//td[text()='Nơi ở hiện tại']/following-sibling::td")
	WebElementFacade otherCurCity;
	
	public Integer get_other_user_age() {
		int age = Integer.parseInt(otherUserAge.getText());
		return age;
	}

	public String get_other_user_body_type() {
		return otherUserBodyType.getText();
	}

	public String get_other_user_constellation() {
		return otherUserConstellation.getText();
	}

	public String get_other_user_cur_city() {
		return otherCurCity.getText();
	}
}
