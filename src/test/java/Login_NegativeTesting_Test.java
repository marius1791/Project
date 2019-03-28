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
import pages.Login_NegativeTesting_Page;
import steps.Login_Flow_Steps;
import steps.Login_NegativeTesting_Steps;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/main/resources/urls.csv", separator = Constants.CSV_SEPARATOR)

public class Login_NegativeTesting_Test extends PageObject {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private Login_NegativeTesting_Steps login_negativeTesting_steps;

    private String url;

    @Before
    public void setupBrowser() {

        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();
    }

    @Test
    @Title("Invalid email - empty field")
    public void Invalid_email_emptyField() {

        login_negativeTesting_steps.invalid_empty_email();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid password - empty field")
    public void Invalid_password_emptyField() {

        login_negativeTesting_steps.invalid_empty_password();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid email - password - empty field")
    public void Invalid_email_password_emptyField() {

        login_negativeTesting_steps.invalid_empty_email_password();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid email - password - digits")
    public void Invalid_email_password_digits() {

        login_negativeTesting_steps.invalid_email_password_digits();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid email - password - specialCharacters")
    public void Invalid_email_password_specialCharacters() {

        login_negativeTesting_steps.invalid_empty_email_password();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid email - password - specialCharacters")
    public void Invalid_email_password_blankSpace() {

        login_negativeTesting_steps.invalid_email_password_blankSpace();
        waitABit(1000);
        driver.quit();
    }
}
