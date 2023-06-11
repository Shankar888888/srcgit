package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngConcept2 {
  
	
	
	WebDriver odriver;
  
  
  @BeforeMethod
  void loginSetup()
  {
	  odriver=new ChromeDriver();
	  odriver.manage().window().maximize();
	  odriver.get("https://app.hubspot.com/login");
  }
  @Test
  void titleOfPage()
  {
	  String title=odriver.getTitle();
	  System.out.println(title);
	 
	  
  }
  /*
  @Test
  void openApp()
  {
	  odriver.get("https://app.hubspot.com/login");
  }*/
  @Test
  void loginpage() throws InterruptedException
  {
	  Thread.sleep(3000);
	  odriver.findElement(By.id("username")).sendKeys("abc@gmail.com");
	  Thread.sleep(3000);
	  odriver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("abc@123");
  }
  @Test
  void selectRememberme() throws InterruptedException
  {
	  Thread.sleep(3000);
	  WebElement ole=odriver.findElement(By.xpath("//span[@class='UICheckbox__PrivateCheckboxIndicator-sc-4hb1iv-1 fRMgaj private-checkbox__indicator']"));
	  ole.click();
  }  
	  @AfterMethod
	  void closepage()
	  {
		  odriver.quit();
      }
  	  
  }

