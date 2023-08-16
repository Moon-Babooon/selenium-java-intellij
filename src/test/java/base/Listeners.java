package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Logging implements ITestListener  {

    public void onTestStart(ITestResult result) {

        String testname = result.getName();

        loggingOnStart("Testcase "+testname+" has started successfuly");

    }

    public void onTestSuccess(ITestResult result) {

        String testname = result.getName();
        loggingOnSuccess("Testcase "+testname+" has passed");

    }

    public void onTestFailure(ITestResult result) {

        String testname = result.getName();
        loggingOnFail("ERROR! Testcase "+testname+" has FAILED");


    }

    public void onFinish(ITestContext contextFinish) {
        String name = contextFinish.getName();
        loggingOnFinish("----------------------------------------\n"
                + "------------------------Testcases are finished"+"\n");
    }

}
