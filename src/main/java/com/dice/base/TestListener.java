package com.dice.base;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

    public void onTestSuccess(ITestResult var1) {
        System.out.println(var1.getTestContext().getCurrentXmlTest().getName() + " Test SUccess");
    }

    public void onTestFailure(ITestResult var1) {
        System.out.println(var1.getTestContext().getCurrentXmlTest().getName() + " Test Failure");
    }

    public void onStart(ITestContext var1) {
        System.out.println(var1.getCurrentXmlTest().getName() + " Test Start");
    }

    public void onFinish(ITestContext var1) {
        System.out.println(var1.getCurrentXmlTest().getName() + " Test Finish");

    }
}
