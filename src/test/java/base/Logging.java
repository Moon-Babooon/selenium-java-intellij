package base;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Logging extends Browser {

    private final Logger log = LogManager.getLogger(Logging.class);

    protected void loggingInfo(String s) {

        log.info(s);

    }

    protected void loggingFatal(String s) {

        log.fatal(s);

    }

    protected void loggingError(String s) {

        log.error(s);

    }

    // Screenshot
    protected void getScreenshot(String testname) {

        Date date = new Date();
        String textDate = date.toString().replace(" ", "_").replace(":", "-");
        String screenshotName = testname+"-FAILED-"+p.getProperty("browser")+"--"+textDate;

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("./src/test/screenshots/"+p.getProperty("browser")+"/"+screenshotName+".png"));
            loggingInfo("Screenshot has been captured");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
