package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Browser {

    public static WebDriver driver;
    public static FileReader f;
    public static Properties p = new Properties();

    @BeforeClass
    private static void browserSetup() throws IOException {

        if (driver==null) {
            f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\configs.properties");
            p.load(f);
        }

        if (p.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(p.getProperty("url"));
        }
        else if (p.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(p.getProperty("url"));
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if (p.getProperty("browser").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get(p.getProperty("url"));
        }
        else if (p.getProperty("browser").equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
            driver.get(p.getProperty("url"));
        }
    }
    private static void browserTearDown() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @BeforeClass
    public static void browserExecution() throws IOException {
        Browser.browserSetup();
    }

    @AfterClass
    public static void browserClosure() {
        Browser.browserTearDown();
    }

}
