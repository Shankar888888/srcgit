        import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.safari.SafariDriver;
		import io.github.bonigarcia.wdm.WebDriverManager;
           public class CrossBrowserTesting {
	
		    static WebDriver odriver;
		    
		    
		    public static void main(String[] args) {
		        
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
		        odriver.get("https://www.amzon.com/");
		        
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
		        
		        odriver.quit();
		        
		    
		                
	}

}
