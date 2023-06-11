package locators;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitsConcept {

	public static void main(String[] args) {
		
//syntax-->driver.manage().timeouts().implicitlywait(specifiedtime,TimeUnit.seconds)
	WebDriverManager.chromedriver().setup();
	WebDriver odriver=new ChromeDriver();
	odriver.get("https://app.hubspot.com/login");
	
	//implicit wait
	
	odriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
	ole.sendKeys("abc");
	
	WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
	ole1.sendKeys("abcd123");
	String title=odriver.getTitle();
	System.out.println(title);
	
	odriver.quit();


/*

//Explicitwait






	WebDriverManager.chromedriver().setup();
	WebDriver odriver=new ChromeDriver();
	odriver.get("https://app.hubspot.com/login");
	
	//explicit wait
	
	
	
	WebElement ole=odriver.findElement(By.xpath("//input[@type='email']"));
	ole.sendKeys("abc");
	
	WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
	ole1.sendKeys("abcd123");
	
	//explicit wait 
	
	
	
	WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(ole1));
	
	
	
	String title=odriver.getTitle();
	System.out.println(title);
	
	odriver.quit();*/

	}

}
