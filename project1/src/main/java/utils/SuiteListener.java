package utils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener ;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
//import testPackage.BaseTest;



public class SuiteListener implements ITestListener,IAnnotationTransformer
{
	@Override
	public void onTestFailure(ITestResult iTestResult) 
	{
		
		
		String filename= System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+iTestResult.getMethod().getMethodName();
		File f =((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
		 
	    try {
	        FileHandler.copy(f, new File(filename+".png"));
	    } 
	    
	    catch (IOException e) 
	    {
	    	e.printStackTrace();
	   
    }
	}
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod)
	{
		  
	      annotation.setRetryAnalyzer(RetryAnalyser.class);
		  
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	

}
