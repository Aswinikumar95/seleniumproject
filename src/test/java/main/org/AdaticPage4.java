package main.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdaticPage4 extends Base{
	public AdaticPage4() {
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditcardnum;
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	@FindBy(id="cc_exp_month")
	private WebElement ccexpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccexpYear;
	@FindBy(id="cc_cvv")
	private WebElement ccCvv;
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcardnum() {
		return creditcardnum;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getCcexpMonth() {
		return ccexpMonth;
	}
	public WebElement getCcexpYear() {
		return ccexpYear;
	}
	public WebElement getCcCvv() {
		return ccCvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	
	

}
