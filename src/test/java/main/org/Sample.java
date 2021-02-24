package main.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample extends Base {
	public static WebDriver d;
	public static void main(String[] args) {
		Base base=new Base();
		
	WebDriver driver = base.getDriver();
	base.loadUrl(driver,"http://www.adactin.com/HotelApp/");
		
	   
		AdaticPage1 page=new AdaticPage1();
		
		WebElement txtUser = page.getTxtUser();
		base.type(txtUser, "Karthi007");
		
		WebElement txtUser2 = page.getTxtpassword();
		base.type(txtUser, "Karthi@1989");
		
		WebElement btnClick;
		
		
	}
	
	
	


}
