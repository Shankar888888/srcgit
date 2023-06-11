package testng.com;

import org.testng.annotations.Test;

public class DependsonMethodConcept {
	@Test(priority=1)
	public void loginpage()
	{
		System.out.println("this is login page");
		
	}
	@Test(dependsOnMethods="loginpage")
	public void homepage()
	{
		System.out.println("this is home page");
	}
	@Test(dependsOnMethods= {"loginpage","homepage"})
	public void productlist()
	{
		System.out.println("this is product list page");
	}
	

}
