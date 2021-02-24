package main.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 extends Base {
	Base base=new Base();
	
	@Parameters({"username","password"})
			
	@Test
	private void test0(String s, String s1) {
		base.getDriver();
		
		base.loadUrl(driver,"https://adactinhotelapp.com/");
		
		base.MaxWindow(driver);
	
	
	
		AdaticPage1 a=new AdaticPage1();
		
		
		type(a.getTxtUser(), s);
		
		
		type(a.getTxtpassword(), s1);
		
		btnClick(a.getBtngin());
}
//	@Parameters({"Loction","Hotel","RoomType","NumOfRoom","clickInDate","chlickOutDate","AultsRoom","childRoom"})
//	@Test
//	private void test1(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
//		
//		AdaticPage2 a=new AdaticPage2();
		
		
	//}
	
	
	
		
		
		
		
	
	
	
	
}
  

