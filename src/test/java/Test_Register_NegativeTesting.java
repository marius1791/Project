import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.Application;
import common.Constants;
import steps.Register_NegativeTesting_Steps;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/main/resources/urls.csv", separator = Constants.CSV_SEPARATOR)


public class Test_Register_NegativeTesting extends PageObject {
    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private Register_NegativeTesting_Steps step;

    private String url;

    @Before
    public void setupBrowser() {

        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();
    }

    @Test
    @Title("Blank Name field")
    public void blank_name_field() {

        step.blankName();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Blank Company field")
    public void blank_company_field() {

        step.blankCompany();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Blank Email field")
    public void blank_email_field() {

        step.blankEmail();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Blank Email field")
    public void blank_password_field() {

        step.blankPassword();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Blank Confirm Password field")
    public void blank_confirm_password_field() {

        step.blankConfirmPassword();
        waitABit(1000);
        driver.quit();
    }

}
