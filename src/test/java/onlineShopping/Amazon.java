package onlineShopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Reporter.log("Opening Amazon", true);
	  Thread.sleep(2000);
	  driver.close();
  }
}
