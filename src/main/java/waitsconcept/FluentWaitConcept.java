package waitsconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver odriver=new ChromeDriver();
       odriver.get("https://app.hubspot.com/login");
       //odriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
       ole.sendKeys("abc");
       //topcasting/upcasting
       Wait<WebDriver> wait = new FluentWait<WebDriver>(odriver)
                   //timeout of the wait
                  .withTimeout(Duration.ofSeconds(30L))
                  //polling time
                  .pollingEvery(Duration.ofSeconds(5L))
                  //exception to ignore
                  .ignoring(Exception.class);
       
       WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
       ole1.sendKeys("abcd123");

       String title=odriver.getTitle();
       System.out.println(title);
       
       odriver.quit();
	}

}
