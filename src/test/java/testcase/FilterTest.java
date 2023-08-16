package testcase;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class FilterTest extends Browser {

    public String actual;
    public String expected;
    public WebElement scroll;

    @Test
    public void filterTest() throws IOException, IOException {

        f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\filter-locators.properties");
        p.load(f);

        SoftAssert soft = new SoftAssert();
        Actions action = new Actions(driver);
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        WebElement filter = driver.findElement(By.xpath(p.getProperty("filter-btn")));
        fwait.until(ExpectedConditions.elementToBeClickable(filter));
        filter.click();
        // Price range ---------------------------------------------------------------------------------
        WebElement h1 = driver.findElement(By.xpath(p.getProperty("header1")));
        actual = h1.getText();
        expected = "Price range";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        WebElement minslider = driver.findElement(By.xpath(p.getProperty("min-slider")));
        action.dragAndDropBy(minslider, 100, 0).perform();;
        WebElement maxslider = driver.findElement(By.xpath(p.getProperty("max-slider")));
        action.dragAndDropBy(maxslider, -150, 0).perform();
        WebElement minprice = driver.findElement(By.xpath(p.getProperty("min-price")));
        minprice.sendKeys("50");
        WebElement maxprice = driver.findElement(By.xpath(p.getProperty("max-price")));
        maxprice.sendKeys("110");

        // Rooms and beds ---------------------------------------------------------------------------------
        WebElement h2 = driver.findElement(By.xpath(p.getProperty("header2")));
        actual = h2.getText();
        expected = "Rooms and beds";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        WebElement anybedrommsbtn = driver.findElement(By.xpath(p.getProperty("bedrooms-btn-any")));
        WebElement anybedsbtn = driver.findElement(By.xpath(p.getProperty("beds-btn-any")));
        WebElement anybathbtn = driver.findElement(By.xpath(p.getProperty("bath-btn-any")));

        action.scrollToElement(anybedrommsbtn).perform();
        action.moveToElement(anybedrommsbtn).perform();;
        action.moveByOffset(80, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        anybedrommsbtn.click();

        action.scrollToElement(anybedsbtn).perform();
        action.moveToElement(anybedsbtn).perform();;
        action.moveByOffset(80, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        anybedsbtn.click();

        action.moveToElement(anybathbtn).perform();;
        action.moveByOffset(80, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        action.moveByOffset(70, 0).click().perform();
        anybathbtn.click();

        // Property type ---------------------------------------------------------------------------------
        WebElement h3 = driver.findElement(By.xpath(p.getProperty("header3")));
        action.scrollToElement(h3).perform();
        actual = h3.getText();
        expected = "Property type";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        scroll = driver.findElement(By.xpath(p.getProperty("header4")));
        scrollJS(scroll);
        WebElement house = driver.findElement(By.xpath(p.getProperty("house-btn")));
        house.click();
        WebElement apartment = driver.findElement(By.xpath(p.getProperty("apt-btn")));
        apartment.click();
        WebElement guesthouse = driver.findElement(By.xpath(p.getProperty("guest-btn")));
        guesthouse.click();
        WebElement hotel = driver.findElement(By.xpath(p.getProperty("hotel-btn")));
        hotel.click();

        // Amenities ---------------------------------------------------------------------------------
        WebElement h4 = driver.findElement(By.xpath(p.getProperty("header4")));
        actual = h4.getText();
        expected = "Amenities";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        scroll = driver.findElement(By.xpath(p.getProperty("header5")));
        scrollJS(scroll);
        WebElement wifi = driver.findElement(By.xpath(p.getProperty("wifi-box")));
        wifi.click();
        WebElement kitchen = driver.findElement(By.xpath(p.getProperty("kitchen-box")));
        kitchen.click();
        WebElement washer = driver.findElement(By.xpath(p.getProperty("washer-box")));
        washer.click();
        WebElement dryer = driver.findElement(By.xpath(p.getProperty("dryer-box")));
        dryer.click();
        WebElement cond = driver.findElement(By.xpath(p.getProperty("cond-box")));
        cond.click();
        WebElement heating = driver.findElement(By.xpath(p.getProperty("heat-box")));
        heating.click();

        // Booking options ---------------------------------------------------------------------------------
        WebElement h5 = driver.findElement(By.xpath(p.getProperty("header5")));
        actual = h5.getText();
        expected = "Booking options";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        WebElement instbook = driver.findElement(By.xpath(p.getProperty("instantbook")));
        action.moveToElement(instbook).perform();
        action.moveByOffset(630, 15).perform();
        action.click();
        action.moveToElement(driver.findElement(By.xpath(p.getProperty("self-checkin")))).perform();
        action.click();

        // Accessibility features ---------------------------------------------------------------------------------
        WebElement h6 = driver.findElement(By.xpath(p.getProperty("header6")));
        actual = h6.getText();
        expected = "Accessibility features";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        scroll = driver.findElement(By.xpath(p.getProperty("header7")));
        scrollJS(scroll);
        WebElement stepfree = driver.findElement(By.xpath(p.getProperty("stepfree-box")));
        stepfree.click();
        WebElement inch = driver.findElement(By.xpath(p.getProperty("32in-box")));
        inch.click();
        WebElement park = driver.findElement(By.xpath(p.getProperty("park-box")));
        park.click();
        WebElement stepfreepath = driver.findElement(By.xpath(p.getProperty("stepfreepath-box")));
        stepfreepath.click();
        action.scrollByAmount(0, 20).perform();

        // Top tier stays ---------------------------------------------------------------------------------
        WebElement h7 = driver.findElement(By.xpath(p.getProperty("header7")));
        actual = h7.getText();
        expected = "Top tier stays";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        scroll = driver.findElement(By.xpath(p.getProperty("header8")));
        WebElement superhost = driver.findElement(By.xpath(p.getProperty("superhost")));
        action.moveToElement(superhost).perform();
        action.moveByOffset(590, 0).perform();
        action.click().perform();

        // Host language ---------------------------------------------------------------------------------
        WebElement h8 = driver.findElement(By.xpath(p.getProperty("header8")));
        actual = h8.getText();
        expected = "Host language";
        soft.assertEquals(actual, expected);
        soft.assertAll();
        WebElement eng = driver.findElement(By.xpath(p.getProperty("eng-box")));
        eng.click();
        action.moveToElement(eng).perform();
        action.moveByOffset(290, 0).click().perform();
        action.moveByOffset(0, 60).click().perform();
        action.moveByOffset(-290, 0).click().perform();
        WebElement showmorebtn4 = driver.findElement(By.xpath(p.getProperty("showmore-last")));
        showmorebtn4.click();
        action.scrollToElement(driver.findElement(By.xpath(p.getProperty("showless")))).perform();
        WebElement showless = driver.findElement(By.xpath(p.getProperty("showless")));
        showless.click();
        try {
            WebElement kor = driver.findElement(By.xpath(p.getProperty("kor-box")));

            kor.click();
        } catch (Exception e) {
            System.out.println(e.getCause());
        } finally {
            WebElement clear = driver.findElement(By.xpath(p.getProperty("clear-btn")));
            clear.click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement confirm = driver.findElement(By.xpath(p.getProperty("confirm")));
            confirm.click();
        }
    }

    public void scrollJS(WebElement x) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", x);

    }


}
