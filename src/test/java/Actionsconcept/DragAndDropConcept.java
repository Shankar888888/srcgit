package Actionsconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class DragAndDropConcept {
    
    
static WebDriver odriver;
    
    @Test
    void alertHandling() throws InterruptedException
    {
    
        odriver=new ChromeDriver();
        odriver.manage().deleteAllCookies();
        odriver.manage().window().maximize();
        odriver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        WebElement oeleSource=odriver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement oeleDesc=odriver.findElement(By.xpath("//div[@id='droppable']"));
        
        Actions oaction=new Actions(odriver);
        oaction.clickAndHold(oeleSource).moveToElement(oeleDesc).release().build().perform();
        Thread.sleep(3000);
        
        //or
        
        
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}