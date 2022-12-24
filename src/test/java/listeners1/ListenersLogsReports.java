package listeners1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogsReports implements ITestListener{
	public void onStart(ITestContext context) 
	{
			System.out.println("Suite is stated");
	}

	public void onTestStart(ITestResult result) 
	{
			System.out.println("Test case is started "+result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test case is Pass "+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test case is fail "+ result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) 
	{
			System.out.println("Test cases is skip "+result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onFinish(ITestContext context) 
	{
			System.out.println("Suite is completed");
	}

}
