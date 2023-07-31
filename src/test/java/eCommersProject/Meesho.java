package eCommersProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void meesh() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
		Reporter.log("opening meesho",true);
		
		driver.get("https://www.meesho.com/");
	Thread.sleep(2000);	
	driver.close();

  }
}
