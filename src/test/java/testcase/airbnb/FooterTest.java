package testcase.airbnb;

import base.Browser;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class FooterTest extends Browser {

    public String actual;
    public String expected;
    public JavascriptExecutor js;

    @Test
    public void footerTest() throws IOException {

        f = new FileReader(
                System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\footer-locators.properties");
        p.load(f);
        SoftAssert soft = new SoftAssert();
        Wait<WebDriver> fwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        WebElement head = driver.findElement(By.xpath(p.getProperty("header")));
        fwait.until(ExpectedConditions.visibilityOf(head));
        head.isDisplayed();
        actual = head.getText();
        expected = "Inspiration for future getaways";
        soft.assertEquals(actual, expected);
        soft.assertAll();

        checkTopSection();
        checkSupport();
        checkHosting();
        checkAirbnbSection();
        checkFooterSection();
        checkSocials();

    }

    private void checkTopSection() {

        WebElement popular = driver.findElement(By.xpath(p.getProperty("popular")));
        popular.click();
        WebElement art = driver.findElement(By.xpath(p.getProperty("art")));
        art.click();
        WebElement outdoors = driver.findElement(By.xpath(p.getProperty("outdoors")));
        outdoors.click();
        WebElement mountains = driver.findElement(By.xpath(p.getProperty("mountains")));
        mountains.click();
        WebElement beach = driver.findElement(By.xpath(p.getProperty("beach")));
        beach.click();
        WebElement unique = driver.findElement(By.xpath(p.getProperty("unique")));
        unique.click();
        WebElement categories = driver.findElement(By.xpath(p.getProperty("categories")));
        categories.click();
        WebElement todo = driver.findElement(By.xpath(p.getProperty("todo")));
        todo.click();
        WebElement friendly = driver.findElement(By.xpath(p.getProperty("friendly")));
        friendly.click();

    }

    private void checkSupport() {

        // Support ---------------------------------------------------------------------
        WebElement support = driver.findElement(By.xpath(p.getProperty("support")));
        support.isDisplayed();
        WebElement help = driver.findElement(By.xpath(p.getProperty("help")));
        help.isDisplayed();
        WebElement aircover = driver.findElement(By.xpath(p.getProperty("aircover")));
        aircover.isDisplayed();
        WebElement discrimination = driver.findElement(By.xpath(p.getProperty("discrimination")));
        discrimination.isDisplayed();
        WebElement disabilities = driver.findElement(By.xpath(p.getProperty("disabilities")));
        disabilities.isDisplayed();
        WebElement cancellation = driver.findElement(By.xpath(p.getProperty("cancellation")));
        cancellation.isDisplayed();
        WebElement neighborhood = driver.findElement(By.xpath(p.getProperty("neighborhood")));
        neighborhood.isDisplayed();

    }

    private void checkHosting() {

        // Hosting ----------------------------------------------------------------------
        WebElement hosting = driver.findElement(By.xpath(p.getProperty("hosting")));
        hosting.isDisplayed();
        WebElement yourhome = driver.findElement(By.xpath(p.getProperty("yourhome")));
        yourhome.isDisplayed();
        WebElement aircoverhosts = driver.findElement(By.xpath(p.getProperty("aircoverhosts")));
        aircoverhosts.isDisplayed();
        WebElement resources = driver.findElement(By.xpath(p.getProperty("resources")));
        resources.isDisplayed();
        WebElement community = driver.findElement(By.xpath(p.getProperty("community")));
        community.isDisplayed();
        WebElement resp = driver.findElement(By.xpath(p.getProperty("responsibly")));
        resp.isDisplayed();
        WebElement airbnbfriendly = driver.findElement(By.xpath(p.getProperty("airbnb-friendly")));
        airbnbfriendly.isDisplayed();

    }

    private void checkAirbnbSection() {

        // Airbnb ---------------------------------------------------------------------------
        WebElement airbnb = driver.findElement(By.xpath(p.getProperty("airbnb")));
        airbnb.isDisplayed();
        WebElement news = driver.findElement(By.xpath(p.getProperty("news")));
        news.isDisplayed();
        WebElement newfeatures = driver.findElement(By.xpath(p.getProperty("newfeatures")));
        newfeatures.isDisplayed();
        WebElement careers = driver.findElement(By.xpath(p.getProperty("careers")));
        careers.isDisplayed();
        WebElement investors = driver.findElement(By.xpath(p.getProperty("investors")));
        investors.isDisplayed();
        WebElement gift = driver.findElement(By.xpath(p.getProperty("gift")));
        gift.isDisplayed();
        WebElement disasterrelief = driver.findElement(By.xpath(p.getProperty("disaster-relief")));
        disasterrelief.isDisplayed();

    }

    private void checkFooterSection() {

        // Footer section -------------------------------------------------------------------
        WebElement terms = driver.findElement(By.xpath(p.getProperty("terms")));
        terms.isDisplayed();
        WebElement sitemap = driver.findElement(By.xpath(p.getProperty("sitemap")));
        sitemap.isDisplayed();
        WebElement privacy = driver.findElement(By.xpath(p.getProperty("privacy")));
        privacy.isDisplayed();
        WebElement yourprivacy = driver.findElement(By.xpath(p.getProperty("yourprivacy")));
        yourprivacy.isDisplayed();

        WebElement lang = driver.findElement(By.xpath(p.getProperty("lang")));
        lang.isDisplayed();
        WebElement currency = driver.findElement(By.xpath(p.getProperty("currency")));
        currency.isDisplayed();

    }

    private void checkSocials() {

        // Socials ----------------------------------------------------------------------------
        WebElement facebook = driver.findElement(By.xpath(p.getProperty("facebook")));
        facebook.isDisplayed();
        WebElement twitter = driver.findElement(By.xpath(p.getProperty("twitter")));
        twitter.isDisplayed();
        WebElement instagram = driver.findElement(By.xpath(p.getProperty("instagram")));
        instagram.isDisplayed();

    }

}
