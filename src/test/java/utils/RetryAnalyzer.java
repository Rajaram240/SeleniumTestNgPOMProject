package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count=0;
	int retryCount=0;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		while(count<retryCount)
		{
			count++;
			return true;
		}
		return false;
	}

}
