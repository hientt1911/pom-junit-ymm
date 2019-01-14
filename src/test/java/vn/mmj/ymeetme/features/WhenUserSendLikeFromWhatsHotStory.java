package vn.mmj.ymeetme.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mmj.ymeetme.steps.LandingPageSteps;
import vn.mmj.ymeetme.steps.LoginByFbSteps;
import vn.mmj.ymeetme.steps.TopMenuSteps;

@RunWith(SerenityRunner.class)
public class WhenUserSendLikeFromWhatsHotStory {

	@Managed
	WebDriver driver;
	
	@Steps
	LandingPageSteps landingPageStep;
	
	@Steps
	LoginByFbSteps loginByFbSteps;
	
	@Steps
	TopMenuSteps topMenuSteps;
	
	@Test
	public void send_like_from_whats_hot_page() {
		
	}
	
	
}
