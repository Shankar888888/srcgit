package testng.com;

import org.testng.annotations.Test;
//Same test case should be executed with n number times then i will go for invocationCount
public class InvocationCountConcept {
  @Test(invocationCount=5)
  public void createAccount()
  {
      System.out.println("Account is created successfully");
      
  }
}