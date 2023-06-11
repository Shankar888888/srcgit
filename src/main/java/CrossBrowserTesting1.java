import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CrossBrowserTesting1 {
    static WebDriver odriver;
    
    
    void launchBrowser()
    {
        String browser="chrome";
        
        if(browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
         odriver=new ChromeDriver();
        } 
        else if(browser.equals("firefox"))
                {
                    WebDriverManager.firefoxdriver().setup();
                    odriver=new FirefoxDriver();
            
                }
        else if(browser.equals("safari"))
                {
                    WebDriverManager.safaridriver().setup();
                    odriver=new SafariDriver();
                }
        else
            {
                System.out.println("Please pass the correct browser name");
            
            }
    }
    
    void enterUrl()
    {
        odriver.get("https://www.amzon.com/");
    
    }
    
    void getTitleAndValidate()
    {
        String t=odriver.getTitle();
        System.out.println(t);
        
        if(t.equals("Amazon.com. Spend less. Smile more."))
        {
            System.out.println("Details are correct");
            
        }
        else
        {
            System.out.println("Details are not correct");
        }
    }
    
    void getCurrentUrlAndValidate()
    {
        String gcu=odriver.getCurrentUrl();
        System.out.println(gcu);
        
        if(gcu.equals("https://www.amazon.com/"))
        {
            System.out.println("This correct url");
            
        }
        else
        {
            System.out.println("This not correct url");
        }
        
    }
    
    void closeBrowser()
    {
        odriver.quit();
    }
    
    public static void main(String[] args) {
        
        CrossBrowserTesting1 obj=new CrossBrowserTesting1();
        obj.launchBrowser();
        obj.enterUrl();
        obj.getTitleAndValidate();
        obj.getCurrentUrlAndValidate();
        obj.closeBrowser();  
        
    }
}
