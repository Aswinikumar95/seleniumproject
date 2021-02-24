package main.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdaticPage3 extends Base {
	private void adaticpage3() {
		PageFactory.initElements(driver,this);
	}
		
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement Logincontinue;
	
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getLogincontinue() {
		return Logincontinue;
	}
	
	

}
