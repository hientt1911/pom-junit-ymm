package vn.mmj.ymeetme.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProfilePage extends PageObject{

	@FindBy(xpath="//table/tbody/tr[2]/td[2]")
	WebElementFacade otherUserAge;
	
	@FindBy(xpath="//td[text()='Dáng người']/following-sibling::td")
	WebElementFacade otherUserBodyType;
	
	public Integer get_other_user_age() {
		int age = Integer.parseInt(otherUserAge.getText());
		return age;
	}

	public String get_other_user_body_type() {
		return otherUserBodyType.getText();
	}
}
