/**
 * 
 */
package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author Sreelakshmi Totkar
 *
 */
public class TestNGListeners implements ITestListener{

	public void onFinish(ITestContext result) {
		System.out.println("test finished and the detatils are "+result.getName());
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("test started and the detatils are "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test failed within success percentage and the detatils are "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failure and the detatils are "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped and the detatils are "+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("test started and the detatils are "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test success and the detatils are"+result.getName());
		
	}

}
