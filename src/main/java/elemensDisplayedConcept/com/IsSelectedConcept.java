package elemensDisplayedConcept.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedConcept {
    static WebDriver odriver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      odriver=new ChromeDriver();
      odriver.get("https://app.hubspot.com/login/");
     WebElement issele=odriver.findElement(By.xpath("//span[@class='UICheckbox__PrivateCheckboxIndicator-ndvpmz-1 kQMGbl private-checkbox__indicator']"));
     issele.click();
     boolean sele=issele.isSelected();
     if(sele)
     {
    	 System.out.println("pass");
     
     }
     else
     {
    	 System.out.println("false");
     }
     odriver.quit();
	}

}
