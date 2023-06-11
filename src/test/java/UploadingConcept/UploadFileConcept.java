package UploadingConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class UploadFileConcept {
static WebDriver odriver;
    
    @Test
    void alertHandling() throws InterruptedException
    {
    
        odriver=new ChromeDriver();
        odriver.manage().deleteAllCookies();
        odriver.manage().window().maximize();
        odriver.get("https://the-internet.herokuapp.com/upload");
        
        //<tag type="file"--->this is mandatory
        odriver.findElement(By.name("file")).sendKeys("/Users/somashekarr/Desktop/Book1.xlsx");
        Thread.sleep(3000);
        
        
        //if there is type="file -->Third party tools-->autoIt or Sikuli or Robot class
        
        
    
    }
    
    
    
    
}