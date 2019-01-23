package vn.mmj.ymeetme.common;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectFacade extends PageObject{

	private String defaultWindow;
	
	public void selectWindow() {
		defaultWindow = getDriver().getWindowHandle();
		List<String> windows = new ArrayList<String>(getDriver().getWindowHandles());
		windows.remove(defaultWindow);
		getDriver().switchTo().window(windows.get(0));
	}
}
