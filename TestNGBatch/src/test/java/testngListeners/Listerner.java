package testngListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerner implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("on Test Start");
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure");
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}


	
	public void onStart(ITestContext context) {
		System.out.println("on Start");
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("on Finish");
	}
}
