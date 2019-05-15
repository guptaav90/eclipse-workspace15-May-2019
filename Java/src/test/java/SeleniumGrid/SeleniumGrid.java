package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumGrid {
	
	
	
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  
	 
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setPlatform(Platform.WIN10);
	  cap.setBrowserName("chrome");
	  WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"),cap);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.google.co.in");
	  String GoogleTitle=driver.getTitle();
	  System.out.println("Google Title is -> " + GoogleTitle);
	  SoftAssert sassert=new SoftAssert();
	  sassert.assertEquals(GoogleTitle, "Googles");
	  sassert.assertAll();
	  
	  
  }
}
