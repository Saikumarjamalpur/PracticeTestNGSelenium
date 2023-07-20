package Core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Page 
{
  @Parameters({"browser","url"})
  @BeforeMethod  // 3rd method
  public void openBrowser(String browser,String url) 
  {
	  System.out.println("openBroswer "+browser+" url "+url+"-> @BeforeMethod");
  }

  @AfterMethod  // 4th method
  public void closeBrowser() 
  {
	  System.out.println("closeBroswer -> @AfterMethod"); 
  }
  
  @Parameters({"wbpath"})
  @BeforeClass  // 2nd method
  public void openWBConnection(String wbpath) 
  {
	  System.out.println("openWBConnectrion"+wbpath+" -> @BeforeClass");
  }

  @AfterClass  // 5th method
  public void closeWBConnection() 
  {
	  System.out.println("closeWBConnection -> @AfterClass");
  }

  @Parameters({"file","key"})
  @BeforeTest   // 1st method 
  public void generatelogreport(String file,String key) 
  {
	  if(!Boolean.parseBoolean(key))
	  {
		  throw new SkipException("skip test");
	  }
	  else {
	  System.out.println("generate log report "+file+"-> @BeforeTest");
	  }
	  }

  @AfterTest  // 6th method
  public void closeReport()
  {
	  System.out.println("close report -> @AfterTest");
  }

}
