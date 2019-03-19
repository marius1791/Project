package pages;

import common.Helper2;
import net.serenitybdd.core.pages.PageObject;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.validation.constraints.AssertTrue;
import java.util.concurrent.TimeUnit;

public class HomePage extends Helper2 {

//    public static By select_Destination_of_the_week() {
//        return By.xpath("\t//a[contains(text(),'destination of the week! The Beach!')]");
//    }

    public static By heading_title() {
        return By.cssSelector(".jumbotron>.container>h1");
    }

    public static By text () {
        return By.xpath("//p[contains(text(),'The is a sample site you can test with BlazeMeter!')]");
    }

    public static By second_text() {
        return By.xpath("//div[@class='jumbotron']//div[@class='container']//p[2]");
    }

    public static By from_text() {
        return By.xpath("//h2[contains(text(),'Choose your departure city:')]");
    }

    public static By flight_from_selector() {
        return By.cssSelector(".form-inline:nth-of-type(1)");
    }

    public static By destination_text() {
        return By.xpath("//h2[contains(text(),'Choose your destination city:')]");
    }

    public static By flight_to_selector() {
        return By.cssSelector(".form-inline:nth-of-type(2)");
    }

    public static By find_flights_button() {
        return By.cssSelector("input[value='Find Flights']");
    }

    //h2[contains(text(),'Choose your destination city:')]


    // Test 1: Home button functionality
    public void homeElements() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(heading_title()).isEqualTo("Welcome to the Simple Travel Agency!");
        softly.assertThat(text()).isEqualTo("The is a sample site you can test with BlazeMeter!");
        softly.assertThat(second_text()).isEqualTo("Check out our destinations of the week! The Beach!");
        softly.assertThat(from_text()).isEqualTo("Choose your departure city:");
        Assert.assertTrue("Flight from selector is not displayed", find(flight_from_selector()).isDisplayed());
        softly.assertThat(destination_text()).isEqualTo("Choose your destination city:");
        softly.assertThat(flight_from_selector()).isEqualTo(flight_to_selector());
        Assert.assertTrue("Find Flights button is not displayed", find(find_flights_button()).isDisplayed());
        waitABit(3000);
//        verifyAndAssertElement(this.getDriver(), flight_to_selector(), "Flight to selector is not displayed");

//        clickElement(this.getDriver(), select_Destination_of_the_week(),2000);
    }



}