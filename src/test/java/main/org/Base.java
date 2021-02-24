package main.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base<TakesScreenshort, TaksScreenshort> {
	public static WebDriver driver;
	// 1 To Luntch Browes
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\ZSample\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
}   // 2 To Luntch Url
	public void loadUrl(WebDriver driver,String Url) {
		driver.get("url");
         
	}
	// 3 to type Value
	public void type(WebElement element,String name) {
		element.sendKeys("hiiiii");
	
		
	}// 4 To Button Click
	public void btnClick(WebElement element) {
		 element.click();
         
	 }
	 // 5 To quitBrower
	public void quitBrower(WebDriver driver) {
		driver.quit();
	}
	// 6 To maximize Window
	public void MaxWindow(WebDriver driver) {
		driver.manage().window().maximize();

	}
	// 7 To get Title
	public void getTitle(WebDriver driver) {
		driver.getTitle();
		
}    // 8 To get Current Url
	public void getCurrentUrl(WebDriver driver) {
		driver.getCurrentUrl();
		
	}
	// 9 To get attribute
	public String getAttribute(WebElement element, String value) {
		element.getAttribute("valur");
		String attribute = element.getAttribute("valur");
		return attribute;
		}
	// 10 to gettext
	public String getGetText(WebElement element) {
		element.getText();
		String text = element.getText();
		return text;
		}
	// 11 to select by value
	public void selectByValue(WebElement element,String Value) {
		Select s =new Select(element);
		s.selectByValue(Value);
          
	}
	//  12 TO selectByIndex
	public void selectByIndex(WebElement element, int num) {
		Select s=new Select(element);
		s.selectByIndex(num);
		
	}// 13 to selectByVisisableText
	public void selectByVisibleText(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
		
	}
	// 14  to getOpton
	public void getOption(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
} 
 
	}
	// 15 to check it is Multiple
	public Boolean isMultiple(WebElement element) {
		Select s =new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		return multiple;
		}		
		
		
	//16 to Select all Option by Value	
	public void selectAllOptionsByvalue(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i <options.size(); i++) {
			WebElement webElement = options.get(i);
			String attribute = webElement.getAttribute("value");
			s.selectByValue(attribute);
			
		}
		
		
	}
	// 17 to SelectAllOptionByIndex
	public void selectAllOptonsByIndex(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
			
		}
	}
	// 18 to SelectAllOptionByVisible
	public void selectAllOptionByVisibleText(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
	}
	//19 to DeSelectAllOptionByValue
	public void deSelectAllOptionByValue(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String attribute = webElement.getAttribute("value");
			System.out.println(attribute);
			
			s.deselectByValue(attribute);
			
			s.selectByValue(attribute);
		}
	}
	// 20 to DeSelectAllOptionByIndex
	public void deSelectAllOptionByIndex(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i <options.size(); i++) {
			s.deselectByIndex(i);
			s.selectByIndex(i);
	
			
		}
	}
	//21 to DeSelectAllOptionByVisiableText
	public void deSeionlectAllOptionByVisiableText(WebElement element) {
		Select s=new Select(element);
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			
			s.selectByVisibleText(text);
			s.deselectByVisibleText(text);
			
		}
	}
	// 22 to deSelect all
	public void deSelectAll(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		 for (int i = 0; i < options.size(); i++) {
			 WebElement webElement = options.get(i);
			 String text = webElement.getText();
			  s.selectByVisibleText(text);
			  s.deselectAll();
			
		}
		
		
	}
	// 23  to get all selected options
	public void getAllSelectedOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
}
	}
	//24 to get first selected options
	public void getFirstSelectOption(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
	}
	
	
	// 25 to simple Alert
	public String aimpleAlert(WebDriver driver) {
		
	  Alert a = driver.switchTo().alert();
	  String text = a.getText();
	  a.accept();
	  return text;
}
	
	// 26 to confirm Alert
	public String confirmAlert(WebDriver driver) {
		 Alert a = driver.switchTo().alert();
		 String text = a.getText();
		 a.accept();
		 return text;
		 
		 
	}
	 // 27 to dismissing the confirm alert
	 public String confirmAlertDismiss(WebDriver driver) {
		 Alert a= driver.switchTo().alert();
		 String text = a.getText();
		 a.dismiss();
		return text;
		 
}
	 // 28 to Dismissing the Prompt alert
	 public void promptAlertDismiss(WebDriver driver,String text) {
	   Alert a = driver.switchTo().alert();
	   a.sendKeys("text");
	 String text1 = a.getText();
	 a.dismiss();
	 a.accept();
	 
		 
	}
	 
	// 29 to DragAndDrop
	 public void dragAndDrop(WebDriver driver,WebElement src,WebElement des) {
		 Actions a =new Actions(driver);
		 a.dragAndDrop(src,des).perform();
		 	
	}
	 // 30to mouse over action
	 public void actionsMovetoElement(WebDriver driver,WebElement element) {
		 Actions a=new Actions(driver);
		 a.moveToElement(element).perform();
		 
}
    // 31 to ringt click
	 public void actionsRightClick(WebDriver driver,WebElement element) {
		 Actions a =new Actions(driver);
		 a.contextClick(element).perform();
}
	 //32 to Double Click
	 public void actionDoubleClick(WebDriver driver,WebElement element) {
		 Actions a=new Actions(driver);
		 a.doubleClick(element).perform();
		 
}
	 //33 to press enter key
	 public void pressEnterKey() throws AWTException {
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
}
	 
	 //34 to press Down key
	 public void pressDown() throws AWTException {
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
	}
	 // 35 to press tab Key
	 public void PressTab() throws AWTException {
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 
	}
	 // 36 to cut the Content
	 public void cutCoutent() throws AWTException {
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_X);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_X);
}
  // 37  to copy the Content
	 public void copyContent() throws AWTException {
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_C);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_C);
		 
		 
	}
	 // 38 to pass the Content
	 public void passContent() throws AWTException {
		 Robot r =new Robot();
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
	}
     // 49 to window handle
	 public void windowHandle(WebDriver driver) {
		 String pid = driver.getWindowHandle();
		 
		 Set<String>  allWin= driver.getWindowHandles();
		 for (String id : allWin) {
			 if (pid !=id) {
				 driver.switchTo();
}
			 }
		 }
	 //40 to get text
	 public String gettText(WebElement element) {
		 String text = element.getText();
		 return text;
		 
	}
	 
	 // 41 to button using js
	 public void clickJavaScript(WebDriver driver,WebElement element) {
	
		 
		 
		 	
	}

	 
		 
		 
	
	 
























}