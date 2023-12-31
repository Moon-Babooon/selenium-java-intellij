package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Logging implements ITestListener  {

    public void onStart(ITestContext context) {
        String contextName = context.getName();
        loggingInfo(" | "+p.getProperty("browser")+" | "+"Testsuite "+contextName+" has started execution!");
    }

    public void onTestStart(ITestResult result) {

        String testname = result.getName();
        loggingInfo(" | "+p.getProperty("browser")+" | "+"Testcase "+testname+" has started successfuly");

    }

    public void onTestSuccess(ITestResult result) {

        String testname = result.getName();
        loggingInfo(" | "+p.getProperty("browser")+" | "+"Testcase "+testname+" has passed");

    }

    public void onTestSkipped(ITestResult result) {

        String testname = result.getName();
        loggingInfo(" | "+p.getProperty("browser")+" | "+"Testcase "+testname+" was SKIPPED");

    }

    public void onTestFailure(ITestResult result) {

        String testname = result.getName();
        loggingFatal(" | "+p.getProperty("browser")+" | "+"ERROR! Testcase "+testname+" has FAILED");

        getScreenshot(testname);

    }

    public void onFinish(ITestContext context) {
        loggingInfo("-- Testsuite is finished -- "+"\n"+" ");
    }

}
