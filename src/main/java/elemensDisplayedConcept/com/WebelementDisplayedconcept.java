package elemensDisplayedConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementDisplayedconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver odriver=new ChromeDriver();
    odriver.get("https://saucedemo.com");
    Boolean oleme=odriver.findElement(By.className("Login_logo")).isDisplayed();
   
    if(oleme)
	{
	   System.out.println("Webelement is present on page");
	
	}
	  else
	       {
	         System.out.println("Web element is not present on page");
	       }
    odriver.quit();
    
    
    
	}
	

}
