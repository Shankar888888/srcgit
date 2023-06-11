package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestngProgram {
	
	WebDriver odriver;
	
	@Test
	void loginPage()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver odriver=new ChromeDriver();
        odriver.get("https://login.salesforce.com/");
        WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
        ole.sendKeys("IBMC");
        WebElement ole1=odriver.findElement(By.xpath("//input[@type='password']"));
        ole1.sendKeys("abcd12345");
        odriver.close();
    }
}
