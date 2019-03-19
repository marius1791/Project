package pages;

import common.Helper2;
import net.serenitybdd.core.pages.PageObject;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.validation.constraints.AssertTrue;
import java.util.concurrent.TimeUnit;

public class HomePage extends Helper2 {

    public static By travel_the_world_subtitle() {
        return By.xpath("//a[contains(text(),'home')]");
    }

    public static By home_subtitle() {
        return By.xpath("//a[contains(text(),'Travel The World')]");
    }

    public static By heading_title() {
        return By.cssSelector(".jumbotron>.container>h1");
    }

    public static By text() {
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

    public static By select_Destination_of_the_week() {
        return By.xpath("\t//a[contains(text(),'destination of the week! The Beach!')]");
    }

    public static By next_page_image() {
        return By.xpath("//img[@class='img-rounded']");
    }

    public static By login_button() {
        return By.xpath("//a[contains(text(),'Login')]");
    }

    public static By register_button() {
        return By.xpath("//a[contains(text(),'Register')]");
    }

    public static By email_address() {
        return By.cssSelector("label.col-md-4[for='email']");
    }

    public static By password() {
        return By.cssSelector("label.col-md-4[for='password']");
    }

    public static By remember_me_checkbox() {
        return By.className("checkbox");
    }

    // Test 1: Home button Elements
    public void homeElements() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(travel_the_world_subtitle()).isEqualTo("Travel The World");
        softly.assertThat(home_subtitle()).isEqualTo("home");
        softly.assertThat(heading_title()).isEqualTo("Welcome to the Simple Travel Agency!");
        softly.assertThat(text()).isEqualTo("The is a sample site you can test with BlazeMeter!");
        softly.assertThat(second_text()).isEqualTo("Check out our destinations of the week! The Beach!");
        softly.assertThat(from_text()).isEqualTo("Choose your departure city:");
        Assert.assertTrue("Flight from selector is not displayed", find(flight_from_selector()).isDisplayed());
        softly.assertThat(destination_text()).isEqualTo("Choose your destination city:");
        softly.assertThat(flight_from_selector()).isEqualTo(flight_to_selector());
        Assert.assertTrue("Find Flights button is not displayed", find(find_flights_button()).isDisplayed());
        waitABit(3000);

    }
    // Test 2: Destination of the week link functionality

    public void homePageLinkFunctionality() {
        selectAndAssertTrue(this.getDriver(), select_Destination_of_the_week(), 2000,
                next_page_image(), "The user cannot reach the next page");
    }

    // Test 3: Home element functionality and login elements should be present after Home is selected

    public void selectHomeAndLoginPageIsPresent(WebDriver webDriver) {
        Actions act = new Actions(webDriver);
        act.moveToElement(webDriver.findElement(home_subtitle())).click().build().perform();
        waitABit(3000);
        element(login_button()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(find(login_button()).isDisplayed());
        element(register_button()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(find(login_button()).isDisplayed());
        element(email_address()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(find(email_address()).isDisplayed());
        element(password()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(find(password()).isDisplayed());
        element(remember_me_checkbox()).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(find(remember_me_checkbox()).isDisplayed());
        waitABit(3000);
    }
}
