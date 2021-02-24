package main.org;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdaticPage1 extends Base  {
	
	public AdaticPage1() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	
	@FindBy(id="login")
	private WebElement btnLogin;


	public WebElement getTxtUser() {
		return txtUser;
	}


	public WebElement getTxtpassword() {
		return txtpassword;
	}


	public WebElement getBtngin() {
		return btnLogin;

	}
	}



