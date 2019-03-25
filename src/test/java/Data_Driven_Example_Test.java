import common.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import static common.City.*;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/main/resources/urls.csv", separator = Constants.CSV_SEPARATOR)

@Concurrent
public class Data_Driven_Example_Test extends PageObject{
    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Managed HomeHelper homeHelper;
    @Managed FlightsPage flightsPage;


    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {Paris, BuenosAires},
                {Philadelphia, Rome},
                {Boston, London},
                {Portland, Berlin},
                {SanDiego, NewYork},
                {MexicoCity, Dublin},
                {SãoPaolo, Cairo}
        });
    }

    private final City cityFrom;
    private final City cityTo;

    public Data_Driven_Example_Test(City cityFrom, City cityTo) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    @Before
    public void setupBrowser() {
        //open url
        getDriver().get("http://blazedemo.com/");

        // make sure the window is maximized
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }

    @After
    public void waitAndQuit() {
        waitABit(1000);
        driver.quit();
    }

    @Test
    public void verifySearchBetweenDifferentLocations() {
        homeHelper.open();
        homeHelper.waitUntilPageLoaded();

        homeHelper.findFlights(cityFrom, cityTo);
        Assert.assertTrue(flightsPage.getFlights().size() > 0);
    }
}
