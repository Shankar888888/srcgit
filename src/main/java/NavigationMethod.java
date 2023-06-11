import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver odriver=new ChromeDriver();
      odriver.get("https://www.google.com");
      System.out.println(odriver.getTitle());
      odriver.navigate().to("http://www.flipkart.com");
      System.out.println(odriver.getTitle());
      odriver.navigate().back();
      System.out.println(odriver.getTitle());
      odriver.navigate().forward();
      System.out.println(odriver.getTitle());
      odriver.quit();
	}

}
