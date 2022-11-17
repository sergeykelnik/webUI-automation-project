package com.demoqa.framework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        switch (result.getStatus()) {
            case ITestResult.SUCCESS:
                return false;
            case ITestResult.FAILURE:
                if (retryCount < maxRetryCount) {
                    result.setStatus(ITestResult.SKIP);
                    retryCount++;
                    return true;
                }
        }
        return false;
    }
}