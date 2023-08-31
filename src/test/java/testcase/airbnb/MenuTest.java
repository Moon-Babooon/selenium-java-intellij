package testcase.airbnb;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class MenuTest extends Browser {



    @Test
    public void topMenuTest() throws IOException {

        f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\menu-locators.properties");
        p.load(f);
        SoftAssert soft = new SoftAssert();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        WebElement pools = driver.findElement(By.xpath(p.getProperty("pools-btn")));
        String actualPoolTxt = pools.getText();
        String expectedPoolTxt = "Amazing pools";
        soft.assertEquals(actualPoolTxt, expectedPoolTxt);
        soft.assertAll();
        pools.click();

        WebElement views = driver.findElement(By.xpath(p.getProperty("views-btn")));
        String actualViewsTxt = views.getText();
        String expectedViewsTxt = "Amazing views";
        soft.assertEquals(actualViewsTxt, expectedViewsTxt);
        soft.assertAll();
        views.click();

        WebElement cabins = driver.findElement(By.xpath(p.getProperty("cabins-btn")));
        String actualCabTxt = cabins.getText();
        String expectedCabTxt = "Cabins";
        soft.assertEquals(actualCabTxt, expectedCabTxt);
        soft.assertAll();
        cabins.click();

        WebElement mansions = driver.findElement(By.xpath(p.getProperty("mansions-btn")));
        String actualMansionsTxt = mansions.getText();
        String expectedMansionsTxt = "Mansions";
        soft.assertEquals(actualMansionsTxt, expectedMansionsTxt);
        soft.assertAll();
        mansions.click();

        WebElement trends = driver.findElement(By.xpath(p.getProperty("trending-btn")));
        String actualTrendsTxt = trends.getText();
        String expectedTrendsTxt = "Trending";
        soft.assertEquals(actualTrendsTxt, expectedTrendsTxt);
        soft.assertAll();
        trends.click();

        WebElement islands = driver.findElement(By.xpath(p.getProperty("islands-btn")));
        String actualIslandsTxt = islands.getText();
        String expectedIslandsTxt = "Islands";
        soft.assertEquals(actualIslandsTxt, expectedIslandsTxt);
        soft.assertAll();
        islands.click();

        WebElement beach = driver.findElement(By.xpath(p.getProperty("beach-btn")));
        String actualBeachTxt = beach.getText();
        String expectedBeachTxt = "Beachfront";
        soft.assertEquals(actualBeachTxt, expectedBeachTxt);
        soft.assertAll();
        beach.click();

        WebElement luxe = driver.findElement(By.xpath(p.getProperty("luxe-btn")));
        String actualLuxeTxt = luxe.getText();
        String expectedLuxeTxt = "Luxe";
        soft.assertEquals(actualLuxeTxt, expectedLuxeTxt);
        soft.assertAll();
        luxe.click();

        WebElement boats = driver.findElement(By.xpath(p.getProperty("boats-btn")));
        String actualBoatsTxt = boats.getText();
        String expectedBoatsTxt = "Boats";
        soft.assertEquals(actualBoatsTxt, expectedBoatsTxt);
        soft.assertAll();
        boats.click();

        WebElement domes = driver.findElement(By.xpath(p.getProperty("domes-btn")));
        String actualDomesTxt = domes.getText();
        String expectedDomesTxt = "Domes";
        soft.assertEquals(actualDomesTxt, expectedDomesTxt);
        soft.assertAll();
        domes.click();

        WebElement tree = driver.findElement(By.xpath(p.getProperty("treehouse-btn")));
        String actualTreeTxt = tree.getText();
        String expectedTreeTxt = "Treehouses";
        soft.assertEquals(actualTreeTxt, expectedTreeTxt);
        soft.assertAll();
        tree.click();

        WebElement rooms = driver.findElement(By.xpath(p.getProperty("rooms-btn")));
        String actualRoomsTxt = rooms.getText();
        String expectedRoomsTxt = "Rooms";
        soft.assertEquals(actualRoomsTxt, expectedRoomsTxt);
        soft.assertAll();
        rooms.click();

        WebElement camp = driver.findElement(By.xpath(p.getProperty("camp-btn")));
        String actualCampTxt = camp.getText();
        String expectedCampTxt = "Camping";
        soft.assertEquals(actualCampTxt, expectedCampTxt);
        soft.assertAll();
        camp.click();

        WebElement castles = driver.findElement(By.xpath(p.getProperty("castle-btn")));
        String actualCasTxt = castles.getText();
        String expectedCasTxt = "Castles";
        soft.assertEquals(actualCasTxt, expectedCasTxt);
        soft.assertAll();
        castles.click();

        WebElement tiny = driver.findElement(By.xpath(p.getProperty("tinyhomes-btn")));
        String actualTinyTxt = tiny.getText();
        String expectedTinyTxt = "Tiny homes";
        soft.assertEquals(actualTinyTxt, expectedTinyTxt);
        soft.assertAll();
        tiny.click();

        WebElement country = driver.findElement(By.xpath(p.getProperty("countryside-btn")));
        String actualCountryTxt = country.getText();
        String expectedCountryTxt = "Countryside";
        soft.assertEquals(actualCountryTxt, expectedCountryTxt);
        soft.assertAll();
        country.click();

        WebElement farms = driver.findElement(By.xpath(p.getProperty("farms-btn")));
        String actualFarmsTxt = farms.getText();
        String expectedFarmsTxt = "Farms";
        soft.assertEquals(actualFarmsTxt, expectedFarmsTxt);
        soft.assertAll();
        farms.click();

        WebElement lakefront = driver.findElement(By.xpath(p.getProperty("lakefront-btn")));
        String actualLakefrontTxt = lakefront.getText();
        String expectedLakefrontTxt = "Lakefront";
        soft.assertEquals(actualLakefrontTxt, expectedLakefrontTxt);
        soft.assertAll();
        lakefront.click();

        WebElement towers = driver.findElement(By.xpath(p.getProperty("towers-btn")));
        String actualTowersTxt = towers.getText();
        String expectedTowersTxt = "Towers";
        soft.assertEquals(actualTowersTxt, expectedTowersTxt);
        soft.assertAll();
        towers.click();

    }

}
