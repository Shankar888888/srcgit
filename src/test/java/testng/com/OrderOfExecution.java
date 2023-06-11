package testng.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExecution {
	@BeforeSuite
	void a()
	{
		System.out.println("Setup");
	}
     @BeforeTest
     void b()
     {
    	 System.out.println("launch");
     }
     @BeforeClass
     void c()
     {
    	 System.out.println("url");
    	 
     }
     @BeforeMethod
     void d()
     {
    	 System.out.println("open login");
     }
     @Test
     void e() 
     {
    	System.out.println("landing"); 
     }
     @AfterMethod
     void dd()
     {
    	 System.out.println("After Method landing");
     }
    @AfterClass
    void cc()
    {
    	System.out.println("After Class Landing");
    }
    @AfterTest
    void bb()
    {
    	System.out.println("Ater test landing");
    }
    @AfterSuite
    void aa()
    {
    	System.out.println("After suite Landing");
    }
     
     
     
     
     
     
     
     
     
     
}
