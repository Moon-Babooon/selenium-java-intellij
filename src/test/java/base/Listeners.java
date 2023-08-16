package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Listeners extends Logging implements ITestListener  {

    public void onTestStart(ITestResult result) {

        String testname = result.getName();

        loggingInfo("Testcase "+testname+" has started successfuly");

    }

    public void onTestSuccess(ITestResult result) {

        String testname = result.getName();
        loggingInfo("Testcase "+testname+" has passed");

    }

    public void onTestFailure(ITestResult result) {

        String testname = result.getName();
        loggingFatal("ERROR! Testcase "+testname+" has FAILED");

        getScreenshot(testname);

    }

    public void onFinish(ITestContext contextFinish) {

        loggingInfo("-- Testcases are finished -- "+"\n"+" ");
    }

}
