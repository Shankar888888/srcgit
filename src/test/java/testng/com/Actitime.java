package testng.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Actitime {
  WebDriver odriver;
  @BeforeTest
 public void Setup()
  {
	odriver=new ChromeDriver();
	odriver.manage().deleteAllCookies();
	odriver.manage().window().maximize();
	odriver.get("https://demo.actitime.com/login.do");
	
	
  }
  @Test
public void testtitle()
  {
	String title=odriver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title,"actiTIME - Login");
  }
  @AfterTest
  public void elementIsselect()
  {
	  odriver.close();
  }
}
