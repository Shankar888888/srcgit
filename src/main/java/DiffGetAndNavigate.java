import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiffGetAndNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver odriver=new  ChromeDriver();
     odriver.navigate().to("http://www.google.com");
     
     odriver.navigate().refresh();
     odriver.quit();
	}

}
