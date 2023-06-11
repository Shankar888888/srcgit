package elemensDisplayedConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckingElementPresent {
      static WebDriver odriver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       odriver=new ChromeDriver();
       odriver.get("https://eportal.incometax.gov.in/iec/foservices/#/login");
       boolean usName=odriver.findElement(By.id("panAdhaarUserId")).isDisplayed();
       if(usName)
       {
    	   System.out.println("pass");
    	   System.out.println(usName);
       }
       else
       {
    	   System.out.println("fail");
       }
       odriver.quit();
       
	}

}
