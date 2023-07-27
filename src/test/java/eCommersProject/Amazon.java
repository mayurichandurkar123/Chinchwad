package eCommersProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void azmazontest() throws InterruptedException {
	  
	WebDriver driver = new ChromeDriver();
	Reporter.log("opening amzon",true);
	
	driver.get("https://www.amazon.com/");
Thread.sleep(2000);	
driver.close();







  }
  
  
}
