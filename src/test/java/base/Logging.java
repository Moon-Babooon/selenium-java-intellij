package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;

public class Logging {

    private Logger log = LogManager.getLogger(Logging.class);;

    protected void loggingOnStart(String s) {


        log.info(s);

    }

    protected void loggingOnFail(String s) {

        log.fatal(s);

    }

    protected void loggingOnSkip(String s) {

        log.error(s);

    }

    protected void loggingOnSuccess(String s) {

        log.info(s);

    }

    protected void loggingOnFinish(String s) {

        log.info(s);

    }

}
