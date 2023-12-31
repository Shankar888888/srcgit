package propDemo.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propdemo1 {
	public WebDriver odriver;
    public static Properties  prop;
    
     public WebDriver launchBrowser(Properties  prop)
        {
         WebDriverManager.chromedriver().setup();
         String browserName= prop.getProperty("browser").toLowerCase().trim();
         
            if(browserName.equalsIgnoreCase("chrome"))
            {
                odriver=new ChromeDriver();
                
            }else if(browserName.equalsIgnoreCase("firefox"))
            {
                odriver=new FirefoxDriver();
            }
            else if(browserName.equalsIgnoreCase("edge"))
            {
                odriver=new EdgeDriver();
            }
            else
            {
                System.out.println("Pass right browser name");
            }
        
            odriver.manage().deleteAllCookies();
            odriver.manage().window().maximize();
            String URL = prop.getProperty("url");
            odriver.get(URL);
            
            return odriver;
        }
        
        public Properties initProp()
        {
            prop=new Properties();
            
            try {
                FileInputStream ip=new FileInputStream("c:\\Users\\acer\\eclipse-workspace\\Seleniumprojct\\src\\main\\java\\propDemo\\config\\config.properties");
                prop.load(ip);
            } catch (FileNotFoundException e) {
                
                e.printStackTrace();
            } catch (IOException e) {
               
                e.printStackTrace();
            }
            return prop;
            
        }
      public Properties loginMethod()
      {
          String email = prop.getProperty("Email");
          String pwd = prop.getProperty("Password");
          odriver.findElement(By.id("email")).sendKeys(email);
          odriver.findElement(By.id("pass")).sendKeys(pwd);
          return prop;
      }
      
      
        public static void main(String[] args) 
        {
            Propdemo1 obj =new Propdemo1();
             obj.launchBrowser(prop);
             obj.initProp();
             obj.loginMethod();
        }
    
    
}

	
