import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunScriptincognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	      //ChromeDriver odriver=new ChromeDriver();
	      ChromeOptions objco=new ChromeOptions();
	      objco.addArguments("--Incognito");
	      WebDriver odriver=new ChromeDriver(objco);
	      odriver.get("http://flipkart.com");
	      System.out.println(odriver.getTitle());
	      //odriver.quit();
	}

}
