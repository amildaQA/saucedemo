package utils;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;




public class BaseTest {
	
	public static WebDriver driver;
	public ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest Logger;

	public void setupDriver(String browserName)
	{ if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"chromedriver");
		driver =new ChromeDriver();
		}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"geckodriver");
		driver =new FirefoxDriver();
	}
	else
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"chromedriver");
		driver =new ChromeDriver();
	}
	}
	
	
	@BeforeTest
	public void BeforeTestMethod()
	{
		 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+File.separator+"reports"+File.separator+"AutomationReport");
		 htmlReporter.config().setEncoding("utf-8");
		 htmlReporter.config().setDocumentTitle("AutomationReport");
		 htmlReporter.config().setReportName("AutomationTestResults");
		 htmlReporter.config().setTheme(Theme.DARK);
		 
		 extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);
		 extent.setSystemInfo("Automation Tester","Amilda Menezes");
		 
	}
	
	
	
	
	
	
	@AfterTest
	public void AfterTestMethod()
	{
		extent.flush();
	}
	
	@BeforeMethod
	@Parameters(value= {"browserName"})
public void BeforeMethodMethod(String browserName,Method testMethod) throws InterruptedException
{
		Logger=extent.createTest(testMethod.getName());
		setupDriver(browserName);
		driver.get(Constants.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		
}
	
	@AfterMethod
	public void AfterMethodMethod(ITestResult result)
	{
		if (result.getStatus()==ITestResult.SUCCESS)
	{
		String methodName=result.getMethod().getMethodName();
		String logText="Testcase:"+methodName+"PASSED";
		
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		Logger.log(Status.PASS, m);
	}
		else if (result.getStatus()==ITestResult.FAILURE)
		{
			String methodName=result.getMethod().getMethodName();
			String logText="Testcase:"+methodName+"FAILED";
			
			Markup m=MarkupHelper.createLabel(logText, ExtentColor.RED);
			Logger.log(Status.FAIL, m);
		}
		
		driver.quit();
	}
	
}
