package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConcept2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver odriver=new ChromeDriver();
     odriver.get("http://app.hubspot.com/login");
     System.out.println(odriver.getTitle());
    // WebElement un=odriver.findElement(By.xpath("//input[@id='username']"));
    // WebElement un=odriver.findElement(By.xpath("//input[@type='email']"));
     //un.sendKeys("shankartl");
     //WebElement pw=odriver.findElement(By.xpath("//input[@id='password']"));
   //  WebElement pw=odriver.findElement(By.xpath("//input[@type='password']"));
     //pw.sendKeys("1234");
    // WebElement em=odriver.findElement(By.xpath("//input[contains(@type,'email')]"));
    // em.sendKeys("shankartl@gmail.com");
    // WebElement em1=odriver.findElement(By.xpath("//input[contains(@type,'password')]"));
    // em1.sendKeys("abc@1234");
     //System.out.println(odriver.findElement(By.xpath("//i18n-string[text()='Email address']")).getText());
     //System.out.println(odriver.findElement(By.xpath("//i18n-string[text()='Forgot my password']")).getText());
     //odriver.findElement(By.xpath("//button[@id='loginBtn']")).click();
    // WebElement ole2=odriver.findElement(RelativeLocator.with(By.xpath("//i18n-string[@data-key='login.signupLink.text']")).toLeftOf(By.xpath("//i18n-string[@data-key='login.signupLink.cta']")));
    // String ss=ole2.getText();
    // System.out.println(ss);
     WebElement ole=odriver.findElement(RelativeLocator.with(By.xpath("//input[contains(@id,'username')]")).above(By.xpath("//input[@id='password']")));
     ole.sendKeys("abc");
     
     WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
     ole1.sendKeys("abcd123");
     Thread.sleep(3000);
    // odriver.findElement(By.xpath("//span[@id='checkbox-content-4']")).click();
     //odriver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).click();
     //odriver.findElement(By.xpath("//span[@class='UIFormControl__StyledSpan-sc-1p73fz1-2 dFluik']"));
     odriver.quit();
     
	}

}
