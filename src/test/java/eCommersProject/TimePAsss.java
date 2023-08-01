package eCommersProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimePAsss {
  @Test
  public void aCSM() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.shadi.com/");
	  Thread.sleep(5000);
	  driver.quit();
	  
  }
}
