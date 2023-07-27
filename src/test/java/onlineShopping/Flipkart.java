package onlineShopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkart() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Reporter.log("Opening Filpkart", true);
	  Thread.sleep(2000);
	  driver.close();
  }
}
