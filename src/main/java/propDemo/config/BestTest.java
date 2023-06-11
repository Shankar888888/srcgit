package propDemo.config;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class BestTest {
    
    DemoProperties dp;
    WebDriver odriver;
    Properties prop;
    
    @Test
    public void appSetUp()
    {
        dp=new DemoProperties();
        prop=dp.initProp();
        odriver=dp.launchBrowser(prop);
    }
    
    
    
    
    
    
    
}
