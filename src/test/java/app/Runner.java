package app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class Runner {
	

  @Test(groups="Chrome")
  public void launch_Chrome() {
	  System.out.println("Web Browser Chrome started....");
  }
  
  @Test(groups="Chrome", dependsOnMethods="launch_Chrome")
  public void launch_Perform_App1() {
	  System.out.println("Reading elements on browser !!!!! > " + Thread.currentThread().getId());
  }
  

  @Test(groups="Firefox")
  public void launch_Firefox() {
	  System.out.println("Web Browser Firefox started....");
  }
  
  @Test(groups="Firefox", dependsOnMethods="launch_Firefox")
  public void launch_Perform_App2() {
	  System.out.println("Reading elements on browser !!!!! > " + Thread.currentThread().getId());
  }

  @Test(threadPoolSize = 2, invocationCount = 3, timeOut = 1000)
  public void runNoxml() {
	  //to execute this method, run as testNG Class, not from XML file
	  System.out.println("Running without xml information");
  }
  

}
